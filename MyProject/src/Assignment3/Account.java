package Assignment3;

public abstract class Account {
	protected double balance;
	
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	abstract void getBalance();
	
	
	public void display() {
		System.out.println("Current balance:"+balance+"\n");
	}
	
}
