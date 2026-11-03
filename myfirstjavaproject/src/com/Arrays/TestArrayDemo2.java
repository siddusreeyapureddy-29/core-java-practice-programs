package com.Arrays;

public class TestArrayDemo2 {

	public static void main(String[] args) {
		int[] marks= {90,78,67,56,97,60};
		int total_sum=0;
		int avg=0;
		for(int i=0;i<marks.length;i++) {
			total_sum=total_sum+marks[i];
		}
		avg=total_sum/marks.length;
		System.out.println("total marks:"+total_sum);
		System.out.println("average marks:"+avg);
	}

}
