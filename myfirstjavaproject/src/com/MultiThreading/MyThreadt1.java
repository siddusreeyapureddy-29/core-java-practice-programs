package com.MultiThreading;

public class MyThreadt1 extends Thread {
	
	@Override
	public void run() {
		Thread.currentThread().setName("StudentThread");
		System.out.println("ThreadName:"+Thread.currentThread().getName());
		for(int i=1;i<=5;i++) {
			System.out.print(i+",");
		}
	}

	public static void main(String[] args) {
		
//		System.out.println(Thread.currentThread().getName());
		MyThreadt1 t1=new MyThreadt1();
		t1.start();
		

	}

}
