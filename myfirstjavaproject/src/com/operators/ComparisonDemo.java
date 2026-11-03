package com.operators;

public class ComparisonDemo {
//comparison operators == != < > <= >=
	public static void main(String[] args) {
		byte a=45;
		byte b=90;
		byte c=45;
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		System.out.println(a<b);//true
		System.out.println(a>b);//false
		System.out.println(a<=c);//true
		System.out.println(a>=c);//true
		System.out.println(b<=c);//false
		System.out.println(b>=c);//true
		String s="siddu";
		String u=new String("siddu");
		System.out.println(s==u);
		String h="siddu";
		System.out.println(s==h);

	}

}
