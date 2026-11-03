package com.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLength {

	public static void main(String[] args) {
		List<String> len=new ArrayList<>(Arrays.asList("siddu","sai","triveni","manaswini","supraja"));
		
		List<String> s=len.stream().filter(t->t.length()>5)
				                    .collect(Collectors.toList());
		
//		len.stream().filter(t->t.length()>5).forEach(t->System.out.println(t));
		
		System.out.println(s); 
	}

}
