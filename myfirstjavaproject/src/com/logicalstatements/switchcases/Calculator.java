package com.logicalstatements.switchcases;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("Enter a number");
		int b=sc.nextInt();
		System.out.println("Enter a symbol");
		String symbol=sc.next();
		
		switch(symbol) {
		case "+"->System.out.println(a+b);
		case "-"->System.out.println(a-b);
		case "*"->System.out.println(a*b);
		case "/"->System.out.println(a/b);
		case "%"->System.out.println(a%b);
		default->System.out.println("invalid choice");
		}
		sc.close();
	}

}
