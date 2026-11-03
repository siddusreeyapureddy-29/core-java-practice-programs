package com.MultiThreading;

class MyThread4 extends Thread{
	 
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Thread 1:"+i);
		}
	}
}

class MyThread5 extends Thread{
	
		 
		@Override
		public void run() {
			for(int i=1;i<=10;i++) {
				System.out.println("Thread 2:"+i);
			}
		}
	}


public class MyThread3{
	

	public static void main(String[] args) {
		
		MyThread4 t=new MyThread4();
		
		
		MyThread5 t1=new MyThread5();
		t.start();
		
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.start();
		
	}

}
