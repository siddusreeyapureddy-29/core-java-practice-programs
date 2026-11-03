package com.langfundamentals.constructors;

public class Bank {
	long accountNumber;
	String accountHolderName;
	double balance;
	String accountType;
	String branchName;
	long mobileNumber;

	Bank() {
		this(12647828765432345l);
		System.out.println("No arg constructor called");
	}

	Bank(long accountNumber) {
		this(accountNumber, "Siddu");
		System.out.println("one arg constructor called");
	}

	Bank(long accountNumber, String accountHolderName) {
		this(23987654321234567L, accountHolderName, 890000.00);
		System.out.println("two arg constructor called");
	}

	Bank(long accountNumber, String accountHolderName, double balance) {
		this(accountNumber, "Sai", balance, "unknown");
		System.out.println("three arg constructor called");
//		this.accountNumber = accountNumber;
//		this.accountHolderName = accountHolderName;
//		this.balance = balance;
	}

	Bank(long accountNumber, String accountHolderName, double balance, String accountType) {
		this(accountNumber, "Triveni", balance, accountType, "hyderabad");
		System.out.println("four arg constructor called");
//		this.accountNumber = accountNumber;
//		this.accountHolderName = accountHolderName;
//		this.balance = balance;
//		this.accountType = accountType;
	}

	Bank(long accountNumber, String accountHolderName, double balance, String accountType, String branchName) {
		this(2345678942234L, accountHolderName, balance, accountType, branchName, 9908527821L);
		System.out.println("five arg constructor called");
//		this.accountNumber = accountNumber;
//		this.accountHolderName = accountHolderName;
//		this.balance = balance;
//		this.accountType = accountType;
//		this.branchName = branchName;
	}

	public Bank(long accountNumber, String accountHolderName, double balance, String accountType, String branchName,
			long mobileNumber) {
		System.out.println("six arg constructor called");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
		this.branchName = branchName;
		this.mobileNumber = mobileNumber;
	}

	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.displayBankInfo();
//		Bank b2 = new Bank(252789034545678986L);
//		b2.displayBankInfo();
//		Bank b3 = new Bank(252789034545678986L, "Siddu Sai Triveni");
//		b3.displayBankInfo();
//		Bank b4 = new Bank(252789034545678986L, "Siddu Sai Triveni", 900000.00);
//		b4.displayBankInfo();
//		Bank b5 = new Bank(252789034545678986L, "Siddu Sai Triveni", 900000.00, "credit amount");
//		b5.displayBankInfo();
//		Bank b6 = new Bank(252789034545678986L, "Siddu Sai Triveni", 900000.00, "credit amount", "hyderabad");
//		b6.displayBankInfo();
//		Bank b7 = new Bank(252789034545678986L, "Siddu Sai Triveni", 900000.00, "credit amount",
//				"hyderabad", 9908527821L);
//		b7.displayBankInfo();

	}

	void displayBankInfo() {
		System.out.println("Account Number is:" + accountNumber);
		System.out.println("Account Holder  Name is is:" + accountHolderName);
		System.out.println("Balance  is:" + balance);
		System.out.println("Account Tyoe is:" + accountType);
		System.out.println("Branch Name is:" + branchName);
		System.out.println("Mobile Number is:" + mobileNumber);
		System.out.println("---------------------------------------");
	}

}
class Bankmanager extends Bank {
	Bankmanager(){
		super();
		System.out.println("bank manager constructor called");
	}
	public static void main(String[] args) {
		System.out.println("bank manager main method called");
		
	}
	
	
}
