 package com.Collections;

import java.util.Arrays;
import java.util.List;

public class OnlyOnceEle {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(4,5,1,2,1,4,5,6,2);
		
		for(int i=0;i<li.size();i++) {
			int count=0;
			for(int j=0;j<li.size();j++) {
				if(li.get(i)==li.get(j)) {
					count++;
				}
				
			}
			if(count==1) {
				System.out.println(li.get(i));
			}
		}
	}

}
