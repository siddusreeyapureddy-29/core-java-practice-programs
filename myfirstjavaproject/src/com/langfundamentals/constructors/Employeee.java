package com.langfundamentals.constructors;

public class Employeee {
	int empid;
	String name;
	double salary;
	String depart;
	int age;

	Employeee() {
		System.out.println("no arg constructor called");
		empid = 101;
		name = "siddu sai triveni";
		salary = 90000.00;
		depart = "Associate";
		age = 25;
	}

	Employeee(int empid, String name, double salary, String depart, int age) {
		System.out.println("Parameterized constructor called");
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.depart = depart;
		this.age = age;

	}

	Employeee(int empid, String name) {
		System.out.println("two arg constructor called");
		this.empid=empid;
		this.name=name;

	}

	public static void main(String[] args) {
		System.out.println("Main Method started");
		Employeee e = new Employeee();
		e.display();
		Employeee e1 = new Employeee(102, "surya", 85000.00, "unknown", 30);
		e1.display();
		Employeee e2 = new Employeee(103, "aparna");
		e2.display();


	}

	void display() {
		System.out.println("Employee id is:" + empid);
		System.out.println("Employee name is:" + name);
		System.out.println("Employee salary is:" + salary);
		System.out.println("Employee department is:" + depart);
		System.out.println("Employee age is:" + age);
		System.out.println("*********************************************");
	}

}
