package com.langfundamentals;

public class TestVariable {
	static int a = 100;
	static char s = 't';
	double d = 10.23;
	float f = 20.7f;
	static char c=65;

	static void method() {
		int b = 100;
		byte c = 127;
//		byte b=(byte)128;
		System.out.println("int value in method:" + b);
		System.out.println("byte value in method:" + c);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("int value:" + a);
		System.out.println("char value:" + s);
		TestVariable t = new TestVariable();
		System.out.println("double value:" + t.d);
		System.out.println("float value:" + t.f);
		System.out.println(c);
//		t.method();
		method();
		int r=100;
		System.out.println(r);
		System.out.println("main method ended");

	}

}
