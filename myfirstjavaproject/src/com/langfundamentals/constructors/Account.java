package com.langfundamentals.constructors;

public class Account {
	long accountNumber;
	String accountHolderName;

	Account() {
		System.out.println("no arg constructor called");
	}

	Account(long accountNumber) {
		this(234567898765432L, "sai");
		System.out.println("one arg constructor called");

	}

	Account(long accountNumber, String accountHolderName) {
		System.out.println("two arg constructor called");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}

	public static void main(String[] args) {
		System.out.println("Account main method started");
	}
}

class SavingsAccount extends Account {
	double balance;

	SavingsAccount() {

	}

	SavingsAccount(long accountNumber, String accountHolderName) {
		super(876545679876543L, "surya");

	}

	SavingsAccount(long accountNumber, String accountHolderName, double balance) {
		super(9874556789L);

		System.out.println("savings account parameterized constructor called");
		this.balance = balance;

	}

	public static void main(String[] args) {
		System.out.println("savings account main method started");
		SavingsAccount s = new SavingsAccount(13546765434567L, "Siddu", 50000);
		s.displayAccountInfo();
		SavingsAccount s1 = new SavingsAccount(6543256789L, "Aparna");
		s1.displayAccountInfo();

	}

	void displayAccountInfo() {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Holder : " + accountHolderName);
		System.out.println("Balance : " + balance);
	}

}
