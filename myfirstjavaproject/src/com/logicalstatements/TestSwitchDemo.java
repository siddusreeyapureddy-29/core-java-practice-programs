package com.logicalstatements;

import java.util.Scanner;

public class TestSwitchDemo {
	String getDays(String day) {
		String dayP=switch(day) {
		case "mon"-> {
			System.out.println("monday is not a jolly day");
			yield "Monday";
		}
		case "tue"-> "Tuesday";
		case "wed"-> "Wednesday";
		case "thur"->"Thursday";
		case "fri"->"Friday";
		case "sat"->"Saturday";
		case "sun"->"Sunday";
		default->"invalid day";
		};
		return dayP;
		
	}

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day");
		String day = sc.next();
		String d = getDays(day);
		System.out.println(d);
		sc.close();
	}

}
