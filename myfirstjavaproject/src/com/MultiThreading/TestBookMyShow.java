package com.MultiThreading;

class BookMyShow{
	int total_tickets=10;
	
	synchronized void bookTickets(String name,int tickets) {
		if(tickets<=total_tickets) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			total_tickets=total_tickets-tickets;
			System.out.println("Tickets booked successfully" +name);
			System.out.println("Your booked tickets are "+tickets);
			System.out.println("Available tickets are:"+total_tickets);
		}
		else {
			System.err.println("Tickets Sold out");
			System.err.println("Total tickets available:"+total_tickets);
		}
	
	
	}
	
	
}
class Customer extends Thread{
	BookMyShow bms;
	String name;
	int tickets;
	public Customer(BookMyShow bms, String name, int tickets) {
		super();
		this.bms = bms;
		this.name = name;
		this.tickets = tickets;
	}
	@Override
	public void run() {
		bms.bookTickets(name, tickets);
	}
	
}
public class TestBookMyShow {

	public static void main(String[] args) {
		System.out.println("main method started");
		BookMyShow bms=new BookMyShow();
		
		Customer siddu=new Customer(bms,"siddu",6);
		siddu.start();
		
		Customer sai=new Customer(bms,"sai",6);
		sai.start();

	}

}
