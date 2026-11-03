package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo2 {

	public static void main(String[] args) {
		Collection<String> c1=new ArrayList<String>();
		c1.add("triveni");
		c1.add("manaswini");
		c1.add("supraja");
		c1.add("doraemon");
		c1.add("nobitha");
		
		Collection<String> c2=new ArrayList<String>();
		c2.add("kuchupuchuu");
		c2.add("rithikaa");
		c2.add("pranavi");
		c2.add("neelima");
		c2.add("ananya");
		
		
		
		//Collection<String> c3=new ArrayList<String>();
		c2.addAll(c1);
		//c3.addAll(c2);
		System.out.println(c2);
		for(String Stud:c2) {
			System.out.println(Stud);
		}
	}

}
