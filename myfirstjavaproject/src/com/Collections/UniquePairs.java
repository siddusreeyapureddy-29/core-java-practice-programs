package com.Collections;

import java.util.Arrays;
import java.util.List;

public class UniquePairs {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(2,7,4,3,5,8,1);
		System.out.println(li);
		int target=9;
		for(int i=0;i<li.size();i++) {
			for(int j=i+1;j<li.size();j++) {
				int num1=li.get(i);
				int num2=li.get(j);
				if(num1+num2==target) {
					System.out.println("("+num1+","+num2+")");
				}
			}
		}
	}

}
