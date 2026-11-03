package com.MultiThreading;

class DownloadThread extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread 1:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}

class CalculationThread extends Thread{
	@Override
	public void run() {

		for(int i=1;i<=5;i++) {
			System.out.println("Thread 2:"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}

class DisplayThread extends Thread{
	@Override
	public void run() {

		for(int i=1;i<=5;i++) {
			System.out.println("Thread 3:"+i);
			Thread.yield();
		}
	}
		
	
}
 
public class TestDemoThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Method started");
		
		DownloadThread dt=new DownloadThread();
		dt.setName("Thread 1");
		dt.setPriority(10);
		System.out.println("Thread Name:"+dt.getName());
		System.out.println("Thread Priority:"+dt.getPriority());
		
		CalculationThread ct=new CalculationThread();
		ct.setName("Thread 2");
		ct.setPriority(5);
		System.out.println("Thread Name:"+ct.getName());
		System.out.println("Thread Priority:"+ct.getPriority());
		
		DisplayThread tt=new DisplayThread();
		tt.setName("Thread 3");
		tt.setPriority(1);
		System.out.println("Thread Name:"+tt.getName());
		System.out.println("Thread Priority:"+tt.getPriority());
		
		dt.start();
		dt.join();
		ct.start();
		ct.join();
		tt.start();
		
		

	}

}
