package com.MultiThreading;

import java.util.Scanner;

public class MultiplicationTable extends Thread {
	int num;
	
	MultiplicationTable(int num){
		this.num=num;
	}
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(num +" X "+ i +" = " +num*i);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		MultiplicationTable m=new MultiplicationTable(num);
		m.start();
		sc.close();
	}

}
