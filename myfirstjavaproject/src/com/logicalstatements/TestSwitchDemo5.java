package com.logicalstatements;

import java.util.Scanner;

public class TestSwitchDemo5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c="";
		do {
		System.out.println("Main Menu:\n");
		System.out.println("1->Domestic Animals\n");
		System.out.println("2->Wild Animals\n");
		System.out.println("Enter your choice");
		int menu=sc.nextInt();
		switch(menu) {
		case 1->{
			System.out.println("Enter the number you want");
			int a=sc.nextInt();
			switch(a) {
			case 1->System.out.println("Cow");
			case 2->System.out.println("Dog");
			case 3->System.out.println("Frog");
			case 4->System.out.println("Mouse");
			default->System.out.println("Invalid demestic animals");
			
			}
		}
		case 2->{
			System.out.println("Enter the wild animal you want");
			int b=sc.nextInt();
			switch(b){
			case 1->System.out.println("Lion");
			case 2->System.out.println("Tiger");
			case 3->System.out.println("Elephant");
			case 4->System.out.println("Lepord");
			default->System.out.println("Invalid wild Animal");
			}
		}
		default->System.out.println("Invalid Menu");
		}
		System.out.println("Do you want to continue or not?press y to continue or n for exit");
		c=sc.next();
		}while(c.equalsIgnoreCase("y"));
		sc.close();
	}

}
