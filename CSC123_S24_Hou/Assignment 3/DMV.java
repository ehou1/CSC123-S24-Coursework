package DMV;

import java.util.ArrayList;
import java.util.List;

class DMV {
    private List<Registration> registrations;
    private List<Citation> citations;

    public DMV() {
        registrations = new ArrayList<>();
        citations = new ArrayList<>();
    }

    public void registerVehicle(Vehicle vehicle, Owner owner) {
        // Check if vehicle has an active registration
        for (Registration reg : registrations) {
            if (reg.getVehicle().equals(vehicle)) {
                System.out.println("Vehicle already registered.");
                return;
            }
        }
        // Create new registration
        registrations.add(new Registration(vehicle, owner));
        System.out.println("Vehicle registered successfully.");
    }

    public void registerCitation(Vehicle vehicle) {
        // Check if vehicle is registered
        boolean found = false;
        for (Registration reg : registrations) {
            if (reg.getVehicle().equals(vehicle)) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Vehicle not found. Cannot register citation.");
            return;
        }
        // Create new citation
        citations.add(new Citation(vehicle));
        System.out.println("Citation registered successfully.");
    }

    public void listAllRegistrations() {
        System.out.println("All Registrations:");
        for (Registration reg : registrations) {
            System.out.println(reg);
        }
    }

    public void listAllCitations() {
        System.out.println("All Citations:");
        for (Citation citation : citations) {
            System.out.println(citation);
        }
    }

    // Other methods for listing registrations/citations for a vehicle/person

 
    public static void main(String[] args) {
        DMV dmv = new DMV();

        // Test functionalities
        Vehicle vehicle1 = new Vehicle("Honda");
        Owner owner1 = new Owner("Elliot Hou");
        Vehicle vehicle2 = new Vehicle("Tesla");

        dmv.registerVehicle(vehicle1, owner1);
        dmv.registerCitation(vehicle2);
        dmv.registerCitation(vehicle1);
        dmv.listAllRegistrations();
        dmv.listAllCitations();
    }
}
