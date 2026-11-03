package com.logicalstatements.switchcases;

import java.util.Scanner;

public class VegetableAndFruit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter category");
		String cat=sc.next();
		switch(cat) {
		case "veg"->{
			System.out.println("Enter vegetable item");
			String item=sc.next();
			switch(item) {
			case "tmt"->System.out.println("tomato");
			case "pto"->System.out.println("Potato");
			case "drm"->System.out.println("Drumstick");
			case "mic"->System.out.println("Mirchi");
			default->System.out.println("Entered item is out of stock");
			}
		}
		case "fruit"->{
			System.out.println("Enter fruit item");
			String fruit=sc.next();
			switch(fruit) {
			case "appl"->System.out.println("Apple");
			case "ban"->System.out.println("Banana");
			case "cust"->System.out.println("Custard Apple");
			case "prom"->System.out.println("Promogranate");
			case "guv"->System.out.println("Guava");
			case "org"->System.out.println("orange");
			default->System.out.println("Entered fruit is out of stock");
			}
		}
		}
		sc.close();
	}

}
