package com.logicalstatements;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		System.out.println("Enter a number:");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a+"is the greater number");
		}else {
			System.out.println(b+"is greater number");
		}
		sc.close();
	}

}
