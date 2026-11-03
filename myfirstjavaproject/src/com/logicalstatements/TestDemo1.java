package com.logicalstatements;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the category:");
		String cat=sc.next();
		switch(cat) {
		case "G"->System.out.println("The price of the ticket is 150");
		case "P"->System.out.println("The price of the ticket is 250");
		case "V"->System.out.println("The price of the ticket is 400");
		default->System.out.println("your entered category is invalid");
		}
		sc.close();
		 
	}

}
