package com.oops.Encapsulation;

class Student2 {
	private int marks;

	public void setMarks(int marks) {
		if (marks > 0 && marks <= 100) {
			this.marks = marks;
		} else {
			System.out.println("invalid marks entered");
		}
	}

	public int getMarks() {
		return marks;
	}
}

public class TestDemo5 {

	public static void main(String[] args) {
		Student2 s=new Student2();
		s.setMarks(85);
		System.out.println(s.getMarks());
		s.setMarks(150);
	}

}
