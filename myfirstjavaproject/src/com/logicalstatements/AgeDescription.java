package com.logicalstatements;

import java.util.Scanner;

public class AgeDescription {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		if(age>=60) {
			System.out.println("Old or Senior Citizen");
		}else if(age>35&&age<=60){
			System.out.println("Middle aged people");
		}else if(age>19&&age<=35) {
			System.out.println("Young people");
		}else if(age>13&&age<=19) {
			System.out.println("Teenage");
		}else if(age>5&&age<=13) {
			System.out.println("Childrens");
		}else{
			System.out.println("Kids");
		}
	}

}
