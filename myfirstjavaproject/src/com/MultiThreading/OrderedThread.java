package com.MultiThreading;

class OrderThread extends Thread {
	@Override
	public void run() {
		System.out.println("Ordered Thread");
	}
}

class CookingThread extends Thread {
	OrderThread orderThread;

	public CookingThread(OrderThread orderThread) {
		this.orderThread = orderThread;
	}

	@Override
	public void run() {
		try {
			orderThread.join();
			System.out.println("Food is Cooking");
			Thread.sleep(2000);
			System.out.println("Food is Ready");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class DeliveryThread extends Thread {
	CookingThread cookingThread;

	public DeliveryThread(CookingThread cookingThread) {
		this.cookingThread = cookingThread;
	}

	@Override
	public void run() {
		try {
			cookingThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Food Delivered");
	}
}

public class OrderedThread {

	public static void main(String[] args) throws InterruptedException {
		OrderThread o = new OrderThread();
		CookingThread c = new CookingThread(o);
		DeliveryThread d = new DeliveryThread(c);

		o.start();
		c.start();
		d.start();

		o.join();
		c.join();
		d.join();

	}

}
