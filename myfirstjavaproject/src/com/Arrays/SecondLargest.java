package com.Arrays;

public class SecondLargest {

	public static void main(String[] args) {

		int[] arr= {10,25,5,40,30};
		int largest=arr[0];
		int secondlargest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			else if(arr[i]>secondlargest) {
				secondlargest=arr[i];
			}
		}
		System.out.println(secondlargest);
	}

}
