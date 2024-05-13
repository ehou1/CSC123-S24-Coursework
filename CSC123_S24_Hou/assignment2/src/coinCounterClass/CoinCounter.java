package coinCounterClass;

public class CoinCounter {

   
    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;

    
    public CoinCounter(int quarters, int dimes, int nickels, int pennies) {
        this.quarters = quarters;
        this.dimes = dimes;
        this.nickels = nickels;
        this.pennies = pennies;
    }

    
    public int getDollarAmount() {
        int totalCents = quarters * 25 + dimes * 10 + nickels * 5 + pennies;
        return totalCents / 100; // Convert cents to dollars
    }

    
    public int getCentsAmount() {
        int totalCents = quarters * 25 + dimes * 10 + nickels * 5 + pennies;
        return totalCents % 100; // Remainder is the cent amount
    }

    
    public int getTotalCents() {
        return quarters * 25 + dimes * 10 + nickels * 5 + pennies;
    }

    
    public String getTotalAmount() {
        int totalCents = getTotalCents();
        int dollars = totalCents / 100;
        int cents = totalCents % 100;
        return String.format("$%d.%02d", dollars, cents);
    }
}
