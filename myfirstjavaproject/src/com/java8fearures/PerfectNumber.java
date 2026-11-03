package com.java8fearures;

import java.util.Scanner;

interface in5 {
	void perfect();
}

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		in5 in = () -> {
			int sum = 0;
			System.out.println("Enter a number:");
			int n = sc.nextInt();
			int num = n;

			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					sum = sum + i;
				}
			}
			if (sum == num) {
				System.out.println(num + "is a perfect number");
			} else {
				System.out.println(num + "is not a perfect number");
			}
		};
		in.perfect();
		sc.close();
	}

}
