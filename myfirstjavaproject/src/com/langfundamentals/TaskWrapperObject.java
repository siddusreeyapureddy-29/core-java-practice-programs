package com.langfundamentals;

public class TaskWrapperObject {

	public static void main(String[] args) {
		int i = 100;
		Integer i1 = i;
		Integer num = 200;
		int a = num;
		byte b = 127;
//		Byte b1=b;
		Byte b1=125;
		byte b2=b1;

		System.out.println(i1);
		System.out.println(num);
		System.out.println(a);
		System.out.println(b);
		System.out.println(b2);

	}

}
