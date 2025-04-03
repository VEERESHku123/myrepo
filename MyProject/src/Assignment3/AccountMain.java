package Assignment3;
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		SavingsAccount obj=new SavingsAccount(10000.00);
		obj.display();
		
		
		obj.deposit(10000);
		obj.getBalance();
		
		obj.withdraw(1000);
		obj.getBalance();
		
		obj.getBalance();
		
		CheckingAccount obj1=new CheckingAccount(1000,500);
		obj1.display();
		
		
		obj1.deposit(100);
		obj1.getBalance();
		
		obj1.withdraw(1200);
		obj1.getBalance();
		
		obj1.getBalance();
		

	}

}
