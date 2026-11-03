package com.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;

public class MinMax {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(50, 34, 89, 100, 30, 21, 34));

		int max = arr.stream().max(Integer::compareTo).get();

		int min = arr.stream().min(Integer::compareTo).get();

		System.out.println("Maximum number is:" + max);
		
		System.out.println("Minimum number is:" + min);
	}

}
