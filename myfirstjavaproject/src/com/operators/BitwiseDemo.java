package com.operators;

public class BitwiseDemo {
	//Bitwise operator && || ^ ~

	public static void main(String[] args) {
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		int a=100;
		int b=240;
		int c=30;
		System.out.println(a>b && a>c);//false
		System.out.println(a>b && a<c);//false
		System.out.println();
		System.out.println();

	}

}
