package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo3 {

	public static void main(String[] args) {
		Collection<String> col=new ArrayList<>();
		col.add("siddu");
		col.add("sai");
		col.add("triveni");
		col.add("manaswini");
		col.add("supraja");
		col.add("anwija");
		col.add("aparna");
		col.add("bharathi");
		col.add("nidhi");
		col.add("leela");
		for(String s:col) {
			System.out.println(s);
		}
		System.out.println(col.contains("triveni"));
		col.remove("anwija");
		System.out.println(col);
		System.out.println(col.isEmpty());
		col.clear();
		System.out.println(col);
		System.out.println(col.isEmpty());
		
		
	}

}
