package Assignment3;

public class SavingsAccount extends Account{
	

	public SavingsAccount(double balance) {
		super(balance);
		System.out.println("Saving account class");
	}

	@Override
	void deposit(double ammount) {
		balance+=ammount;
		System.out.println("Amount credited successfuly.\n");
		
	}
	
	@Override
	void withdraw(double amount) {
		if(balance<amount) {
			System.out.println("Insuficient Balance.\n");
		}
		else {
			balance-=amount;
			System.out.println("Amount debited successfuly.\n");
		}
	}
	@Override
	void getBalance() {
		System.out.println("Total Availabe Balance:"+balance);
	}

}
