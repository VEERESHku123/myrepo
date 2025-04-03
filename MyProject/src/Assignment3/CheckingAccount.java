package Assignment3;

public class CheckingAccount extends Account{
	
	 private double overdraftLimit;
	    
	    public CheckingAccount(double balance, double overdraftLimit) {
	        super(balance);
	        this.overdraftLimit = overdraftLimit;
	        System.out.println("\nChecking account class");
	    }
	    
	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Amount credited successfuly.\n");
	        }
	    }
	    
	    @Override
	    public void withdraw(double amount) {
	        if (amount > 0 && balance - amount >= -overdraftLimit) {
	            balance -= amount;
	            System.out.println("Amount debited successfuly.\n");

	        } 
	        else {
	            System.out.println("Withdrawal exceeds overdraft limit!");
	        }
	    }
	    
	    @Override
	    public void getBalance() {
	        System.out.println("Total Availabe Balance:"+balance);
	    }
	
}
