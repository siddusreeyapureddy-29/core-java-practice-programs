package com.langfundamentals.constructors;

public class Employee {
	int empid;
	String sname;
	double salary;
	String course;
	char gen;

	Employee() {
		this(105);
		System.out.println("no arg constructor");

	}

	Employee(int empid) {
		this(106,"Anwija");
		System.out.println("one arg constructor");
	}

	Employee(int empid, String sname) {
		this(70000.00,"jfs",'F');
		System.out.println("two arg constructor");

	}

	Employee(double salary, String course, char gen) {
		this(107,"manswitha",60000.00,"pfs");
		System.out.println("three arg constructor");

	}
	

	public Employee(int empid, String sname, double salary, String course) {
		this(108,"sreenu",100000.00,"data science",'M');
		System.out.println("four arg constructor");

	}

	public Employee(int empid, String sname, double salary, String course, char gen) {
		System.out.println("Five arg constructor");
		this.empid = empid;
		this.sname = sname;
		this.salary = salary;
		this.course = course;
		this.gen = gen;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.empdisplay();
//		Employee e2 = new Employee(102);
//		e2.empdisplay();
//		Employee e3 = new Employee(103, "surya");
//		e3.empdisplay();
//		Employee e4 = new Employee(80000.00, "python full stack", 'M');
//		e4.empdisplay();
//		Employee e5 = new Employee(104, "aparna", 900000.00, "data science", 'F');
//		e5.empdisplay();

	}

	void empdisplay() {
		System.out.println("Employee id is:" + empid);
		System.out.println("Employee name is:" + sname);
		System.out.println("Employee salary is:" + salary);
		System.out.println("Employee course is:" + course);
		System.out.println("Employee gen is:" + gen);
		System.out.println("-----------------------------------------------");
	}

}
