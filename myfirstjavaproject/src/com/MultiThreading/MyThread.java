package com.MultiThreading;

public class MyThread extends Thread{
	public void run() {
		System.out.println("run method started");
		for(int i=0;i<=10;i++) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		MyThread t=new MyThread();
		t.start();
		System.out.println("main method ended");


	}

}
