package com.langfundamentals.constructors;

public class Student {
	int id;
	String name;
	String course;
	Student(){
		id=101;
		name="siddu sai triveni";
		course="java full stack";
	}

	public static void main(String[] args) {
		Student s=new Student();
		s.display();

	}
	void display() {
		System.out.println("Student id is:"+id);
		System.out.println("Student name is:"+name);
		System.out.println("Student course is:"+course);
	}

}
