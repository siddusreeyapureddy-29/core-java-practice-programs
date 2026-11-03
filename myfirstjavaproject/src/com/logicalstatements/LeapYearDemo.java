package com.logicalstatements;

import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year to check whether it is leap year or not");
		int n = sc.nextInt();
		if (n % 400 == 0 || n % 4 == 0 && n % 100 != 0) {
			System.out.println("it is a leap year");
		} else {
			System.out.println("it is not a leap year");
		}
		sc.close();
		
	}

}
