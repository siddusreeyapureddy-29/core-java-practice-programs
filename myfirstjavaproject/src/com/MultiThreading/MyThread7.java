package com.MultiThreading;

public class MyThread7 extends Thread{
	
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Thread Interrupted");
			
		}
	}

	public static void main(String[] args) {
		MyThread7 tt=new MyThread7();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		tt.start();
		tt.interrupt();
		
		
	}

}
