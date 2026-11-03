package com.java8fearures;

import java.util.Scanner;

interface in6 {
	void prime();
}

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for(int i=2;i<=n;i++) {
			if (n % i== 0) {
				System.out.println(n + "is not a prime number");
			} else {
				System.out.println(n + "is a prime number");
			}
		}
	}

}
