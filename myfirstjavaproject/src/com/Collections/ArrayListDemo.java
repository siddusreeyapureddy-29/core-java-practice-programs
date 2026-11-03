package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> li=new ArrayList<>();
		li.add("JavaScript");
		li.add("Python");
		li.add("SQL");
		li.add("HTML");
		int index=li.indexOf("Python");
		li.add(index+1,"Java");
		
		System.out.println(li);
	}

}
