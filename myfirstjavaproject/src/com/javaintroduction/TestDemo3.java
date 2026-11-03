package com.javaintroduction;

public class TestDemo3 {
	static int id;
	static String name;

	int number;
	int email;
	static {
		System.out.println("This is static block");
	}
	{
		System.out.println("This is instance block");
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println(id);
		System.out.println(name);
		TestDemo3 d=new TestDemo3();
		System.out.println(d.number);
		System.out.println(d.email);


	}

}
