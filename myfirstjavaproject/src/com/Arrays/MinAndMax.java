package com.Arrays;

public class MinAndMax {

	public static void main(String[] args) {

		int[] arr= {78,45,90,67,21,10,55};
		 
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			else if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("min is:"+min);
		System.out.println("max is:"+max);
	}

}
