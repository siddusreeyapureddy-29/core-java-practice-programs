package com.logicalstatements;

import java.util.Scanner;

public class EligibilityCriteria {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("you are elligible for voting and driving");
		}
		else {
			System.out.println("You are not elligible for voting");
		}
		sc.close();
	}

}
