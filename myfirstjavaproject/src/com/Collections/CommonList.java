package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CommonList {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		List<Integer> li=Arrays.asList(1,2,2,3,4,5);
		List<Integer> li1=Arrays.asList(2,2,4,4,6);
		for(int i=0;i<li.size();i++) {
			for(int j=0;j<li1.size();j++) {
				if(li.get(i)==li1.get(j)) {
					set.add(li.get(i));
				}
			}
		}
		System.out.println(set);
	}

}
