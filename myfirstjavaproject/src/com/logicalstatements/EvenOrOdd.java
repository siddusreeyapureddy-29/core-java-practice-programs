package com.logicalstatements;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println("The number is negative number " + n);
		} else {
			System.out.println("The number is positive number " + n);
		}
		if (n % 2 == 0) {
			System.out.println(n + " is a even number");
		} else {
			System.out.println(n + " is a odd number");
		}
		sc.close();
	}

}
