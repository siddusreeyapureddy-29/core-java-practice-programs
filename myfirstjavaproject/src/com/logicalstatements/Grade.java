package com.logicalstatements;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter average marks");
		int avg=sc.nextInt();

	
		
		if(avg>100||avg<0) {
			System.out.println("invalid marks");
		}else if(avg>=90) {
			System.out.println("Grade A");
		}else if(avg>=80) {
			System.out.println("Grade B");
		}else if(avg>=70) {
			System.out.println("Grade C");
		}else if(avg>=60) {
			System.out.println("Grade D");
		}else if(avg>=35) {
			System.out.println("Just Passed");
		}else {
			System.out.println("Failed");
		}
		sc.close();
	}

}
