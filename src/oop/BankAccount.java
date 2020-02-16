package oop;

// The BankAccount class will implement the IInterest interface.
 public class BankAccount implements IInterest{
	 
	 // Properties of BankAccount
		private static int ID = 1000;
		private String accountNumber; 
		private static final String routingNumber = "004500576";
		private String name;
		private String SSN;
		private double balance;
		
		// BankAccount constructor
		public BankAccount(String SSN, double initDeposit) {
			balance = initDeposit;
			this.SSN = SSN;
			ID++;
			System.out.println(ID);
			setAccountNumber();
		}
		
		// Methods
		public void makeDeposit(double amount) {
			balance = balance+amount;
			System.out.println("Making Deposit: " + amount);
			showBalance();
		}
		public void makeWithdraw(double amount) {
			balance = balance-amount;
			System.out.println("Make Withdraw: " + amount);
			showBalance();
		}
		public void showBalance() {
			System.out.println("Balance: " + balance);
		}
		
		@Override
		public void accrue() {
			balance = balance * (1 + rate/100); // Interest calculation
			showBalance();
	    }
		
		// Getters and Setters
		private void setAccountNumber() {
			int random = (int) (Math.random() * 100);
			System.out.println(random);
			accountNumber = ID + "" + random + SSN.substring(0, 2);
			System.out.println("Your Account Number: " + accountNumber);
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		
	// Prints out the results for account number, routing number and balance in toString format
		@Override
		public String toString() {
			return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n" + "[Routing number: " + routingNumber + "]\n" + "[Balance: " + balance + "]";
		}
}
