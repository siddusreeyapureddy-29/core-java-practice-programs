package com.Arrays;

public class TestArrayDemo {

	public static void main(String[] args) {
		//Declaration
		int[] ages;
		
		//creation
		ages=new int[5];
		
		//initialization
		ages[0]=45;
		ages[1]=23;
		ages[2]=34;
		ages[3]=12;
		ages[4]=19;
		
		//representation
		System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println(ages[2]);
		System.out.println(ages[3]);
		System.out.println(ages[4]);
		System.out.println("**********************************");
		//using for loop
		for(int i=0;i<ages.length;i++) {
			System.out.println(ages[i]+" ");
		}
		System.out.println("**********************************");
		
		//for each loop
		for(int age:ages) {
			System.out.println(age +" ");
		}
	}

}
