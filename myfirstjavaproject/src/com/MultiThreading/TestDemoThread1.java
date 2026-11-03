package com.MultiThreading;

class Counter{
	static int count=0;
	
	synchronized void increment() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		count++;
		System.out.println(count);
		
	}
	
}

class CounterThread extends Thread{
	
	Counter counter;
	
	public CounterThread(Counter counter) {
		this.counter = counter;
	}



	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			counter.increment();
		}
	}
	
}



public class TestDemoThread1 {

	public static void main(String[] args) {
		
		Counter counter=new Counter();
		
		CounterThread c=new CounterThread(counter);
		c.start();
		
		CounterThread c1=new CounterThread(counter);
		c1.start();
		
		try {
			c.join();
			c1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Total count is:"+ Counter.count);
		

	}

}
