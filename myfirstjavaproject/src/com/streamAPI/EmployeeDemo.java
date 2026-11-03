package com.streamAPI;

import java.util.HashMap;

public class EmployeeDemo {

	public static void main(String[] args) {

		HashMap<Integer,String> e=new  HashMap<>();
		
		e.put(101,"siddu");
		e.put(102, "sai");
		e.put(103, "triveni");
		e.put(104, "manaswini");
		e.put(105,"supraja");
		e.entrySet()
		.stream()
		.forEach(e1->System.out.println(e1.getKey()+"->"+e1.getValue()));
				
	}

}
