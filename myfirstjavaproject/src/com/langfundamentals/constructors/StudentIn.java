package com.langfundamentals.constructors;

public class StudentIn extends Person{
	int marks;
	String department;
	StudentIn(){
		
	}

	public static void main(String[] args) {
		StudentIn s=new StudentIn();
		s.disp();
		

	}
	void disp() {
		System.out.println("Person name is:"+name);
		System.out.println("person age is:"+age);
		System.out.println("person nationality is:"+nationality);
		
	
	}

}
