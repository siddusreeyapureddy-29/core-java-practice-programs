package com.ExceptionHandling;

import java.util.Scanner;

public class OnlineShopping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] products= {"mobile","watch","tv"};
		try {
		System.out.println("Enter price");
		String price=sc.next();
		double price1=Double.parseDouble(price);
		System.out.println(price1);
		}
		catch(Exception e) {
			e.printStackTrace();
			try {
				System.out.println("The product i want in an array is:"+products[5]);
				}
				catch(Exception e1) {
					e1.printStackTrace();
					try {
						System.out.println("Enter quantity:");
						int quantity=sc.nextInt();
						System.out.println("Enter price:");
						int price=sc.nextInt();
						int result=price/quantity;
						System.out.println(result);
					}
					catch(Exception e2) {
						e2.printStackTrace();
					}
				}
		}
		finally {
			System.out.println("Order processing completed");
		}
		
		sc.close();
		
	}

}
