package com.javaintroduction;

public class TestLab {
	byte age = 20;
	short year = 2026;
	int salary = 350000;
	float pi = 3.14159265358F;
	double price = 3445.89342516786342d;

	public void method1() {
		System.out.println("age is:" + age);
		System.out.println("year is:" + year);
		System.out.println("salary is:" + salary);
		System.out.println("pi value is:" + pi);
		System.out.println("price is:" + price);

	}

	public static void main(String[] args) {
		TestLab t1 = new TestLab();
		t1.method1();
//		System.out.println("age is:" + t1.age);
//		System.out.println("year is:" + t1.year);
//		System.out.println("salary is:" + t1.salary);
//		System.out.println("pi value is:" + t1.pi);
//		System.out.println("price is:" + t1.price);

	}

}
