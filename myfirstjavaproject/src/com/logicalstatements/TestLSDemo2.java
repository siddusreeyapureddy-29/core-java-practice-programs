package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n="";
		do {
			System.out.println("Enter a alphabet");
			char c = sc.next().charAt(0);
			switch (c) {
			case 'a' -> System.out.println(c + " is an vowel");
			case 'e' -> System.out.println(c + " is an vowel");
			case 'i' -> System.out.println(c + " is an vowel");
			case 'o' -> System.out.println(c + " is an vowel");
			case 'u' -> System.out.println(c + " is an vowel");
			default -> System.out.println(c + " is a conconent");
			}
			System.out.println("do you want to continue or not?click y to continue or n for exit");
			n=sc.next();
		}while(n.equalsIgnoreCase("y"));
		sc.close();
	}

}
