package com.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurenceOfWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Character,Integer> map=new HashMap<>();
		System.out.println("Enter your string:");
		String str=sc.next();
		char[] ch=str.toCharArray();
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c,1);
			}
		}
		System.out.println(map);
		sc.close();
	}

}
