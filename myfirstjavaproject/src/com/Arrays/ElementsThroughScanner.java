package com.Arrays;

import java.util.Scanner;

public class ElementsThroughScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int n:arr) {
		System.out.print(n+" ");
		}
		sc.close();

	}
	
}
