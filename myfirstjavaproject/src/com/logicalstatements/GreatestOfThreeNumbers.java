package com.logicalstatements;

import java.util.Scanner;

public class GreatestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("Enter a number");
		int b=sc.nextInt();
		System.out.println("Enter a number");
		int c=sc.nextInt();
		if(a>b&&a>c) {
			System.out.println(a+"is greater number");
		}else if(b>c){
			System.out.println(b+"is greater number");
		}else {
			System.out.println(c+"is greater number");
		}
		sc.close();
	}

}
