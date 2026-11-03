package com.langfundamentals.constructors;


public class Person {
	String name;
	int age;
	String nationality;
	Person(){
		System.out.println("no arg constructor called");
	}
	Person(String name){
		this(name,27);
		System.out.println("one arg constructor called");
	}
	Person(String name,int age){
		System.out.println("two arg constructor called");
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Person p=new Person();
		p.displayPerson();
		Person p1=new Person("sai");
		p1.displayPerson();
//		p1.display();
//		
//		p.displaymethod();
		
	}
	void displayPerson() {
		System.out.println("Person name is:"+name);
		System.out.println("person age is:"+age);
		System.out.println("person nationality is:"+nationality);
		System.out.println(this.name);
//		this.display();
	}
//	void display() {
//		System.out.println("display method called");
//		
//	}
//	void dis(Person p) {
//		System.out.println("nationality is:"+nationality);
//	}
//	void displaymethod() {
//		dis(this);
//	}
	

}
