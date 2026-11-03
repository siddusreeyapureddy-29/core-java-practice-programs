package com.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int[][] arr=new int[3][4];
		arr[0][0]=10;
		arr[1][1]=20;
		arr[2][2]=30;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for(int[] arr1:arr) {
			for(int a:arr1) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}

}
