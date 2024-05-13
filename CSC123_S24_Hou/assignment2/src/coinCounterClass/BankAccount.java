package coinCounterClass;

public class BankAccount {

   
    private String ownerFirstName;
    private String ownerLastName;
    private double balance;
    private boolean open;

   
    public BankAccount(String ownerFirstName, String ownerLastName, double initialDepositAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.balance = initialDepositAmount;
        this.open = true;
    }

    
    public boolean deposit(double amount) {
        if (open && amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    
    public boolean withdraw(double amount) {
        if (open && amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    
    public boolean isOpen() {
        return open;
    }

    
    public void close() {
        open = false;
    }

   
    public String getOwnerFullName() {
        return ownerFirstName + " " + ownerLastName;
    }
}
