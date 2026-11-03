package com.logicalstatements;

import java.util.Scanner;

public class UsernameAndPassword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		String username=sc.next();
		System.out.println("Enter password");
		String password=sc.next();
		System.out.println("Enter username that you should verify");
		String user=sc.next();
		System.out.println("Enter password that you should verify");
		String pass=sc.next();
		if(username.equals(user)) {
			if(password.equals(pass)) {
				System.out.println("Login successfull");
			}else {
				System.out.println("Wrong password");
			}
		}else {
			System.out.println("Wrong username");
		}
		sc.close();
	}

}
