package com.langfundamentals.methods;

import java.util.Scanner;

public class StudentTest {
	int StudentId;
	String StudentName;
	double marks;
	static int count = 0;
	static Scanner sc = new Scanner(System.in);
	{
		count++;
	}

	public static void main(String[] args) {
		StudentTest t = new StudentTest();
		System.out.println("Enter student id:");
		t.StudentId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter student name:");
		t.StudentName = sc.nextLine();
		System.out.println("Enter marks:");
		t.marks = sc.nextDouble();
		sc.nextLine();
		t.displayWelcome();
		t.getStudentDetails(t.StudentId, t.StudentName, t.marks);
		double mark = t.getMarks();
		System.out.println("marks is:" + mark);
		double bonusmarks = t.calculateBonusMarks(2);		
		System.out.println("total marks after adding bonus is:" + bonusmarks);
		bonusmarks=t.marks;
		System.out.println("total marks after adding marks is:"+mark);
		displayCollegeName();
		int dcount = displayTotalStudentsCount();
		System.out.println("count is:" + dcount);

	}

	void displayWelcome() {
		System.out.println("Welcome to Student info");
	}

	void getStudentDetails(int id, String name, double marks) {
		System.out.println("Student id is:" + id);
		System.out.println("Student name is:" + name);
		System.out.println("Student marks is:" + marks);

	}

	double getMarks() {
		return marks;
	}

	double calculateBonusMarks(int bonus) {
		double total_marks = bonus + marks;
		return total_marks;
	}

	static void displayCollegeName() {
		System.out.println("college name is:yogi vemana university");
	}

	static int displayTotalStudentsCount() {
		return count;

	}

}
