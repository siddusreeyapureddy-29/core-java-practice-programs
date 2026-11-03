package com.oops.Encapsulation;

class BankAccount {
	private double balance;

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("Invalid deposit amount");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance");
		}
	}
}

public class TestDemo8 {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.deposit(10000);
		b.withdraw(3000);
		System.out.println("CUrrent balance:" + b.getBalance());
		b.withdraw(8000);
	}

}
