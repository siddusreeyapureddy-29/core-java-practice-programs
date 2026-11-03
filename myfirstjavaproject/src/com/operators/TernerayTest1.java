package com.operators;

public class TernerayTest1 {

	public static void main(String[] args) {
		int a=30;
		int b=8;
		int c=10;
		int d=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("the biggest number is:"+d);
		int e=(a<b)?(a<c?a:c):(b<c?b:c);
		System.out.println("the smallest number is:"+e);
	}

}
