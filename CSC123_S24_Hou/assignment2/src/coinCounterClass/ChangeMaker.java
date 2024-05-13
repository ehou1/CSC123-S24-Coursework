package coinCounterClass;

public class ChangeMaker {

    
    private int totalCents;

    
    public ChangeMaker(int dollars, int cents) {
        this.totalCents = dollars * 100 + cents;
    }

    
    public int getQuarters() {
        return totalCents / 25;
    }

   
    public int getDimes() {
        return (totalCents % 25) / 10;
    }

   
    public int getNickels() {
        return ((totalCents % 25) % 10) / 5;
    }

  
    public int getPennies() {
        return ((totalCents % 25) % 10) % 5;
    }
}
