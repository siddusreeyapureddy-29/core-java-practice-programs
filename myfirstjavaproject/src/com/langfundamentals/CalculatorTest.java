package com.langfundamentals;

import java.util.Scanner;

public class CalculatorTest {
	void add() {
		int a = 10;
		int b = 80;
		System.out.println("Addition of two numbers with no args is:" + (a + b));
	}

	void add(float a, float b) {
		System.out.println("Addition of two numbers with two arguments:" + (a + b));
	}

	void add(float a, float b, float c) {
		System.out.println("Addition of three numbers with three arguments:" + (a + b + c));
	}

	void substract() {
		float a = 100;
		float b = 50;
		System.out.println("substraction of two numbers with no args is:" + (a - b));

	}

	void substract(float a, float b) {
		System.out.println("substraction of two numbers with two arguments:" + (a - b));
	}

	void substract(float a, float b, float c) {

		System.out.println("substraction of three numbers with three arguments:" + (a - b - c));
	}

	void multiply() {
		int a = 20;
		int b = 150;
		System.out.println("multiplication of two numbers with no args is:" + (a * b));

	}

	void multiply(float a, float b) {
		System.out.println("multiplication of two numbers with two arguments:" + (a * b));
	}

	void multiply(float a, float b, float c) {
		System.out.println("multiplication  of three numbers with three arguments:" + (a * b * c));
	}

	void divide() {
		float a = 20;
		float b = 3;
		System.out.println("division of two numbers with no args is:" + (a / b));

	}

	void divide(float a, float b) {
		System.out.println("division of two numbers with two arguments:" + (a / b));
	}

	void divide(float a, float b, float c) {
		System.out.println("division of three numbers with three arguments:" + (a / b / c));
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Calculator ");
		CalculatorTest t = new CalculatorTest();
		t.add();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number a:");
		float a = sc.nextFloat();
		System.out.println("Enter a number b:");
		float b = sc.nextFloat();
		t.add(a, b);
		System.out.println("Enter a number c:");
		float c = sc.nextFloat();
		t.add(a, b, c);
		t.substract();
		t.substract(a, b);
		t.substract(a, b, c);
		t.multiply();
		t.multiply(a, b);
		t.multiply(a, b, c);
		t.divide();
		t.divide(a, b);
		t.divide(a, b, c);

		sc.close();

	}

}
