package com.langfundamentals.methods;

import java.util.Scanner;

public class MethodsWithPandR {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Main method started ");
		MethodsWithPandR t = new MethodsWithPandR();
		int add = t.add(34, 89);
		System.out.println("Addition of two numbers is:" + add);
		double sub = t.substract(98.67f, 45.34f);
		System.out.printf("Substraction of two numbers is:%.2f%n" , sub);
		float mul = t.multiply(89, 23);
		System.out.println("Multiplication of two numbers is:" + mul);
		double div = t.division(89.79, 3.0);
		System.out.println("Division of two numbers is:" + div);
		int t1 = t.studentMtotal(67, 34, 78);
		System.out.println("Total marks is:" + t1);
		double per = t.percentage(t1);
		System.out.println("Percentage is:" + per);
		System.out.println("Enter marks:");
		int m = sc.nextInt();
		boolean ispass = t.isPassed(m);
		System.out.println("the student is:"+ispass);

	}

	int add(int a, int b) {
		int c = a + b;
		return c;
	}

	double substract(float a, float b) {
		float c = a - b;
		return c;
	}

	float multiply(int a, int b) {
		float c = a * b;
		return c;
	}

	double division(double a, double b) {
		return a / b;
	}

	int studentMtotal(int a, int b, int c) {
		int total_marks = a + b + c;
		return total_marks;
	}

	double percentage(int total_marks) {
		return total_marks / 3.0;
	}

	boolean isPassed(int marks) {

		return marks >= 35;
	}

}
