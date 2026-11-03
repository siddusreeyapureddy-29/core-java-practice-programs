package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ReplaceAll {

	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		int index=0;
		Iterator<Integer> itr=li.iterator();
		while(itr.hasNext()) {
			itr.next();
			if(index%2==0) {
				li.set(index,0);
				
			}
			index++;
		}
		System.out.println(li);
	}

}
