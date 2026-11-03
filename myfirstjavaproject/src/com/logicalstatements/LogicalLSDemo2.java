package com.logicalstatements;

import java.util.Scanner;

public class LogicalLSDemo2 {

	public static void main(String[] args) {
		System.out.println("naukri app intervie system");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name:");
		String name = sc.nextLine();
		System.out.println("Hello Nice to meet you" + name);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("age is:" + age);
		if (age >= 22 || age <= 30) {
			System.out.println("you are elligible for this job");
			System.out.println("are you a fresher:");
			boolean fresher = sc.nextBoolean();
			if (!fresher) {
				System.out.println("we will consider you for this job!");

				System.out.println("you have education gap or not");
				boolean education = sc.nextBoolean();
				if (!education) {
					System.out.println("sorry!you may leave now");

					System.out.println("How much salary are you expecting");
					double salary = sc.nextDouble();
					if (salary <= 2500000.00 || salary >= 300000.00) {
						System.out.println("we may start the discussion");

					} else {
						System.out.println("sorry we will get back to you");
					}
				} else {
					System.out.println("we will discuss further");
				}
			} else {
				System.out.println("Sorry we are not taking freshers!good luck");
			}
		} else {
			System.out.println("you are not elligible for this job");
		}
		sc.close();
	}

}
