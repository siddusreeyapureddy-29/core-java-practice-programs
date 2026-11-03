package com.logicalstatements;

import java.util.Scanner;

public class LogicLSDdemo23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = sc.nextLine().charAt(0);
		if (c >= 'a' && c <= 'z') {
			System.out.println("it is a lower case letter " + c);
		} else if (c >= 'A' && c <= 'Z') {
			System.out.println("it is a uppercase letter " + c);
		} else if (c >= '0' && c <= '9') {
			System.out.println("it is a digit" + c);
		} else {
			System.out.println("it is a special character " + c);
		}
		sc.close();
	}

}
