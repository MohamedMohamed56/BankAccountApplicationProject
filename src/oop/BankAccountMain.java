package oop;

/*
 * Creating a Bank account application where a user is assigned an SSN number and initial deposit 
 * to an account and the user will be able to make a deposit as well as make withdraw and each balance
 * from three accounts can accrue interest after the withdraw had been made from the accounts. 
 * 
 * 
 */

 // BankAccountMain application class
public class BankAccountMain {

	public static void main(String[] args) {
	  
		// Creating three accounts, with SSN numbers and initial deposits 
	  BankAccount account1 = new BankAccount("456392847", 1000);
	  BankAccount account2 = new BankAccount("287994545", 3000);
	  BankAccount account3 = new BankAccount("128008989", 5000);
	  
	  // First account
	  account1.setName("Joe");
	  System.out.println(account1.getName());
	  account1.makeDeposit(500);
	  account1.makeWithdraw(1000);
	  account1.accrue();
	  System.out.println(account1.toString());
	  
	  // Second account
	  account2.setName("Matt");
	  System.out.println(account2.getName());
	  account2.makeDeposit(500);
	  account2.makeWithdraw(1000);
	  account2.accrue();
	  System.out.println(account2.toString());
	  
	  // Third account
	  account3.setName("Luke");
	  System.out.println(account3.getName());
	  account3.makeDeposit(500);
	  account3.makeWithdraw(1000);
	  account3.accrue();
	  System.out.println(account3.toString());
	}
}

