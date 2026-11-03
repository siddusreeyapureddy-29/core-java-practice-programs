package com.Arrays;

//min and max element in an array
public class TestArrayDemo4 {

	public static void main(String[] args) {
		
		int[] arr= {89,45,90,4,24,78,99,202};
		
		int min=arr[0];
		int max=arr[0];
		
		for(int a:arr) {
			if(a<min) {
				min=a;
				
			}
			else if(a>max) {
				max=a;
			}
			
		}
		System.out.println("max is:"+max);
		System.out.println("min is:"+min);
	}

}
