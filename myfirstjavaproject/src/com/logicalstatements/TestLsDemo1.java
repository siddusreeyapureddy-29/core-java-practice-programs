package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter another number");
		int b = sc.nextInt();
		System.out.println("Enter an expression to perform operation:");
		String op = sc.next();
		switch (op) {
		case "+":
			System.out.println("Addition of two numbers is:" + (a + b));
			break;
		case "-":
			System.out.println("Substraction of two numbers is:" + (a - b));
			break;
		case "*":
			System.out.println("Multiplication of two numbers is:" + (a * b));
			break;
		case "/":
			System.out.println("Division of two numbers is:" + (a / b));
			break;
		case "%":
			System.out.println("modulus of two numbers is:" + (a % b));
			break;
		default:
			System.out.println("your given expression is incorrect");
		}
		sc.close();
	}

}
