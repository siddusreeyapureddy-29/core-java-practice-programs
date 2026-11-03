package com.operators;

public class Swap {

	public static void main(String[] args) {
		int a=90;
		int b=120;
		System.out.println(a);
		System.out.println(b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a is:"+a);
		System.out.println("After swapping b is:"+b);
		int x=30;
		int y=200;
		int temp=0;
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping x is:"+x);
		System.out.println("After swapping y is:"+y);


	}

}
