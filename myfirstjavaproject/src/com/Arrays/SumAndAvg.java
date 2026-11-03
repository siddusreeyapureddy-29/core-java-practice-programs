package com.Arrays;

public class SumAndAvg {

	public static void main(String[] args) {

		int[] marks= {90,59,69,23,89,56,45};
		
		int sum=0;
		double avg=0;
		
		for(int i=0;i<marks.length;i++) {
			sum=sum+i;
		}
		System.out.println("sum is:"+sum);
		
		avg=sum/marks.length;
		System.out.println("average is:"+avg);
	}

}
