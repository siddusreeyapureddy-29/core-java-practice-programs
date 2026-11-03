package com.MultiThreading;

class BankAccount{
	int balance=10000;
	
	synchronized void withdrawl(int withdrawlAmount) {
		while(withdrawlAmount>balance) {
			System.out.println("Insufficient Balance.customer is waiting");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
		}
		
			balance=balance-withdrawlAmount;
			System.out.println("whithdrawl amount is:"+withdrawlAmount);
			System.out.println("Total amount after withdrawl is:"+balance);
			notify();
	}
}
 
class Customer1 extends Thread{
	BankAccount ba;
	int amount;
	public Customer1(BankAccount ba, int amount) {
		super();
		this.ba = ba;
		this.amount = amount;
	}
	@Override
	public void run() {
		ba.withdrawl(amount);
	}
}


public class BankExampDemo {

	public static void main(String[] args) {
		
		BankAccount ba=new BankAccount();
		
		Customer1 c=new Customer1(ba,7000);
		c.start();
		
		Customer1 c1=new Customer1(ba,4000);
		c1.start();
		
		Customer1 c2=new Customer1(ba,3000);
		c2.start();

	}

}
