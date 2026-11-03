package com.oops.Encapsulation;

class Student3 {
	private int id;
	private String name;
	private double marks;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public double getMarks() {
		return marks;
	}
}

public class TestDemo7 {

	public static void main(String[] args) {
		Student3 s = new Student3();
		s.setId(101);
		s.setName("siddu");
		s.setMarks(85.5);
		System.out.println("Id :" + s.getId());
		System.out.println("Name:" + s.getName());
		System.out.println("Marks:" + s.getMarks());
	}

}
