package com.langfundamentals.constructors;

public class Bankaccount {
	long accountNumber;
	String accountHolderName;
	double balance;
	String accountType;
	String branchName;
	long mobileNumber;

	Bankaccount() {
		System.out.println("No arg constructor called");
	}

	Bankaccount(long accountNumber) {
		System.out.println("one arg constructor called");
		this.accountNumber = accountNumber;
	}

	Bankaccount(long accountNumber, String accountHolderName) {
		System.out.println("two arg constructor called");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}

	Bankaccount(long accountNumber, String accountHolderName, double balance) {
		System.out.println("three arg constructor called");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	Bankaccount(long accountNumber, String accountHolderName, double balance, String accountType) {
		System.out.println("four arg constructor called");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
	}

	Bankaccount(long accountNumber, String accountHolderName, double balance, String accountType, String branchName) {
		System.out.println("five arg constructor called");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
		this.branchName = branchName;
	}

	public Bankaccount(long accountNumber, String accountHolderName, double balance, String accountType,
			String branchName, long mobileNumber) {
		System.out.println("six arg constructor called");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
		this.branchName = branchName;
		this.mobileNumber = mobileNumber;
	}

	public static void main(String[] args) {
		Bankaccount b1 = new Bankaccount();
		b1.displayBankInfo();
		Bankaccount b2 = new Bankaccount(252789034545678986L);
		b2.displayBankInfo();
		Bankaccount b3 = new Bankaccount(252789034545678986L, "Siddu Sai Triveni");
		b3.displayBankInfo();
		Bankaccount b4 = new Bankaccount(252789034545678986L, "Siddu Sai Triveni", 900000.00);
		b4.displayBankInfo();
		Bankaccount b5 = new Bankaccount(252789034545678986L, "Siddu Sai Triveni", 900000.00, "credit amount");
		b5.displayBankInfo();
		Bankaccount b6 = new Bankaccount(252789034545678986L, "Siddu Sai Triveni", 900000.00, "credit amount",
				"hyderabad");
		b6.displayBankInfo();
		Bankaccount b7 = new Bankaccount(252789034545678986L, "Siddu Sai Triveni", 900000.00, "credit amount",
				"hyderabad", 9908527821L);
		b7.displayBankInfo();

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
