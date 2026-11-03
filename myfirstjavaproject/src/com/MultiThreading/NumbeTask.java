package com.MultiThreading;

public class NumbeTask implements Runnable{

	public static void main(String[] args) {
		System.out.println("main method started");
		NumbeTask n=new NumbeTask();
		Thread t=new Thread(n);
		t.start();
		
		
	}

	@Override
	public void run() {
		System.out.println("rum method started");
		for(int i=2;i<=20;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}

}
