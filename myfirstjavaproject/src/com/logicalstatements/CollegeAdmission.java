package com.logicalstatements;

import java.util.Scanner;

public class CollegeAdmission {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		System.out.println("Enter age");
		int age=sc.nextInt();
		if(marks>65) {
			if(age>18) {
				System.out.println("Elligible for admission");
			}else {
				System.out.println("Age requirement not satisfied");
			}
		}else {
			System.out.println("Marks requirement not satisfied");
		}
		sc.close();
	}

}
