
import java.util.*;

public class LibraryManagementSystem {
    private Map<String, Member> members;
    private Map<String, ReferenceMaterial> catalogue;
    private List<Loan> loans;

    public LibraryManagementSystem() {
        members = new HashMap<>();
        catalogue = new HashMap<>();
        loans = new ArrayList<>();
    }

    
    public void newMembership() {
       
    }

    
    public void addMaterial() {
       
    }

    
    public void issueItem() {
      
    }

    
    public void returnItem() {
       
    }

    
    public void reportInventory() {
        
    }

   
    public void reportLoans() {
        
    }

    
    public void lookupMembership() {
       
    }

    
    public static void main(String[] args) {
        LibraryManagementSystem system = new LibraryManagementSystem();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            // Display menu
            System.out.println("1 - New Membership");
            System.out.println("2 - Add Material");
            System.out.println("3 - Issue Item");
            System.out.println("4 - Return Item");
            System.out.println("5 - Report Inventory");
            System.out.println("6 - Report Loans");
            System.out.println("7 - Lookup Membership");
            System.out.println("8 - Exit");
            System.out.print("Please enter your choice: ");
            choice = scanner.nextInt();

           
            switch (choice) {
                case 1:
                    system.newMembership();
                    break;
                case 2:
                    system.addMaterial();
                    break;
                case 3:
                    system.issueItem();
                    break;
                case 4:
                    system.returnItem();
                    break;
                case 5:
                    system.reportInventory();
                    break;
                case 6:
                    system.reportLoans();
                    break;
                case 7:
                    system.lookupMembership();
                    break;
                case 8:
                    System.out.println("The program will now exit.");
                    break;
                default:
                    System.out.println("Choice is not valid. Please try again.");
                    break;
            }
        } while (choice != 8);

        scanner.close();
    }
}

class Member {
    
}

class ReferenceMaterial {
  
}

class Loan {
   
}
