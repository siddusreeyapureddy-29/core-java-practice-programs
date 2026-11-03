package com.operators;

import java.util.Scanner;

public class ArithematicRectDemo {
	double RectPerimeter(double l,double b) {
		double peri=2*(l+b);
		return peri;
	}
	double RectArea(double l,double b) {
		double area=l*b;
		return area;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of rectangle:");
		double length=sc.nextDouble();
		System.out.println("enter breadth of rectangle:");
		double breadth=sc.nextDouble();
		ArithematicRectDemo a=new ArithematicRectDemo();
		double perimeter=a.RectPerimeter(length, breadth);
		System.out.println("perimeter of rectangle is:"+perimeter);
		double area1=a.RectArea(length, breadth);
		System.out.println("Area of rectangle is:"+area1);
		sc.close();
	}

}
