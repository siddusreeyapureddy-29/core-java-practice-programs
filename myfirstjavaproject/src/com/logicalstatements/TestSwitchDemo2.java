package com.logicalstatements;

import java.util.Scanner;

public class TestSwitchDemo2 {
	int getArithematicOp(int a, int b,String op) {
		int op1 = switch (op) {
		case "add" -> {
			int c = a + b;
			yield c;
		}
		case "sub" -> {
			int d = b - a;
			yield d;
		}
		case "mul" -> {
			int e = a * b;
			yield e;
		}
		default -> 0;
		};
		return op1;

	}

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter another number");
		int b = sc.nextInt();
		System.out.println("Enter operation");
		String op = sc.next();

		int num = getArithematicOp(a, b,op);
		System.out.println(num);
		sc.close();
	}

}
