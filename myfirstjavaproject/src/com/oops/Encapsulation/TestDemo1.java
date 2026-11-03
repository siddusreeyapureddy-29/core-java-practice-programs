package com.oops.Encapsulation;

class Student {
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

public class TestDemo1 {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(101);
		s.setName("siddu");
		s.setMarks(90);
		System.out.println(s.getId() + ":" + s.getName() + ":" + s.getMarks());
	}

}
