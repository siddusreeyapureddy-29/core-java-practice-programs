package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String y = "";
		String c="";
		String k="";
		String q="";
		String ordereditems="";
		int totalbill=0;
		do {
			System.out.println("Enter catogery");
			String ctg = sc.next();
			switch (ctg) {
			case "starter" -> {
				do {
				System.out.println("Enter the dish");
				String dish = sc.next();
				switch (dish) {
				case "c65" -> {
					System.out.println("Chicken 65 price is 250");
				ordereditems +="chicken65\n";
				totalbill+=250;				
				}
				case "cmgs" ->{
					System.out.println("chicken magestic price is 300");
					ordereditems +="chicken magestic\n";
					totalbill+=300;
					
				}
				case "ckbab" ->{
					System.out.println("chicken kabab price is 350");
					ordereditems +="chicken kabab\n";
					totalbill+=350;
				}
				case "gchi" -> {
					System.out.println("gongura chicken price is 350");
					ordereditems +="Gongura chicken\n";
					totalbill+=350;
				}
				
				case "chilop" -> {
					System.out.println("chicken lollipop price is 400");
					ordereditems +="chicken lollipop\n";
					totalbill+=400;
				}
				default -> System.out.println("the started you have entered is currently unavailable");
				}System.out.println("Dou you want to have another starter?press y to continue or n to no");
				 c=sc.next();
				}while(c.equalsIgnoreCase("y"));
			}
			case "biryani" -> {
				do {
				System.out.println("enter biryani type");
				String biry = sc.next();
				switch (biry) {
				case "chikbir" -> {
					System.out.println("chicken biryani price is 350");
					ordereditems +="chicken biryani\n";
					totalbill+=350;
				}
				case "mtbir" -> {
					System.out.println("mutton biryani price is 450");
					ordereditems +="mutton biryani\n";
					totalbill+=450;
				}
				case "gmt" -> {
					System.out.println("gongura mutton biryani pric is 500");
					ordereditems +="gongura mutton\n";
					totalbill+=500;
				}
				case "cmbir" -> {
					System.out.println("chitti muthayala biryani price is 450");
					ordereditems +="chitti muthayala biryani\n";
					totalbill+=450;
				}
				default -> System.out.println("the biryani you have requested is currently unavailable");
				}
				System.out.println("do you want to make another biryani order?press y to continue or n to stop");
				k=sc.next();
				}while(k.equalsIgnoreCase("y"));
			}
			case "dessert" -> {
				do {
				System.out.println("enter dessert");
				String des = sc.next();
				switch (des) {
				case "cake" ->{
					System.out.println("chocolate cake price is 100");
					ordereditems +="chocolate cake\n";
					totalbill+=100;
				}
				case "apr" -> {
					System.out.println("Apricot delight price is 250");
					ordereditems +="Apricot delight\n";
					totalbill+=250;
				}
				case "gulab" -> {
					System.out.println("Gulab jamun price is 200");
					ordereditems +="gulab jamun\n";
					totalbill+=200;
				}
				default -> System.out.println("the dessert you have entered is currently unavailable");
				}
				System.out.println("do you want to have another desert order>press y to continue or n to stop");
				q=sc.next();
			}while(q.equalsIgnoreCase("y"));
			}
				default->System.out.println("your entered category is invalid");
			}
			System.out.println("do you want to continue or not?click y to continue or n for exit");
			y = sc.next();
		}while (y.equalsIgnoreCase("y"));
		System.out.println("ordered items\n:"+ordereditems);
		System.out.println("total bill is:"+totalbill);
		sc.close();
	}

}
