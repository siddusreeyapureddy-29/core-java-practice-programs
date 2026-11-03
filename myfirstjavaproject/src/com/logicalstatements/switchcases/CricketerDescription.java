package com.logicalstatements.switchcases;

import java.util.Scanner;

public class CricketerDescription {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter jersey number");
		int jno=sc.nextInt();
		switch(jno) {
		case 7:
			System.out.println("Mahendra Singh Dhoni");
			break;
		case 45:
			System.out.println("Rohith Sharma");
			break;
		case 18:
			System.out.println("Virat Kohli");
			break;
		case 77:
			System.out.println("Shubman Gill");
			break;
		default:
			System.out.println("Enter jersey number is not playing today");
		}
		sc.close();
	}

}
