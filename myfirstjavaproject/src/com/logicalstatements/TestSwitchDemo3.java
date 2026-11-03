package com.logicalstatements;

import java.util.Scanner;

public class TestSwitchDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int balance=7000;
		int choice;
		do {
			System.out.println("1.check balance\n");
			System.out.println("2.withdraw\n");
			System.out.println("3.deposit\n");
			System.out.println("4.exit");
			
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1->System.out.println("the amount in your account is:"+balance);
			case 2->{
				System.out.println("Enter amount:");
				balance-=sc.nextInt();
			}
			case 3->{
				System.out.println("Enter amount:");
				balance+=sc.nextInt();
			}
			default->System.out.println("invalid choice");
				
			}
			
		}while(choice!=4);
		sc.close();
	}

}
