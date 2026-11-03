package com.langfundamentals.methods;

import java.util.Scanner;

public class SidduDemo {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SidduDemo s = new SidduDemo();
		String n = s.getName();
		System.out.println("Student name is:" + n);
		char g = s.getGender();
		System.out.println("Student gender is:" + g);
		long m = s.getMobilNumber();
		System.out.println("Student mobile number  is:" + m);
		String mail = s.getEmail();
		System.out.println("Student mail is:" + mail);
		int id = s.getStudentId();
		System.out.println("Student id  is:" + id);
		int age = s.getStudentAge();
		System.out.println("Student age is:" + age);
		String fn = s.getFatherName();
		System.out.println("Student father name  is:" + fn);
		double h = s.getHeight();
		System.out.println("Student height is:" + h);
		byte w = s.getWeight();
		System.out.println("Student weight is:" + w);
		boolean b = s.isPassed();
		System.out.println("Student is passed or not:" + b);
		double p = s.getPercentage();
		System.out.println("Student percentage  is:" + p);
		char gr = s.getGrade();
		System.out.println("Student grade is:" + gr);
		double c = s.getCgpa();
		System.out.println("Student cgpa is:" + c);

	}

	String getName() {
		System.out.println("Enter name:");
		String name = sc.nextLine();
		System.out.println("Name info");
		return name;

	}

	char getGender() {
		System.out.println("Enter Gender:");
		char gen = sc.next().charAt(0);
		System.out.println("gender info");
		return gen;

	}

	long getMobilNumber() {
		System.out.println("Enter mobile number:");
		long mobil = sc.nextLong();
		sc.nextLine();
		return mobil;

	}

	String getEmail() {
		System.out.println("Enter email:");
		String mail = sc.nextLine();
		return mail;
	}

	int getStudentId() {
		System.out.println("Enter student id:");
		int id = sc.nextInt();
		return id;
	}

	int getStudentAge() {
		System.out.println("Enter Student age:");
		int age = sc.nextInt();
		sc.nextLine();
		return age;
	}

	String getFatherName() {
		System.out.println("Enter father name:");
		String fname = sc.nextLine();
		return fname;
	}

	double getHeight() {
		System.out.println("Enter height:");
		double height = sc.nextDouble();
		return height;
	}

	byte getWeight() {
		System.out.println("Enter Weight:");
		byte weight = sc.nextByte();
		return weight;
	}

	boolean isPassed() {
		System.out.println("Enter true or false:");
		boolean ispass = sc.nextBoolean();
		return ispass;
	}

	double getPercentage() {
		System.out.println("Enter percentage:");
		double percentage = sc.nextDouble();
		return percentage;
	}

	char getGrade() {
		System.out.println("Enter grade:");
		char grade = sc.next().charAt(0);
		return grade;
	}

	double getCgpa() {
		System.out.println("Enter cgpa:");
		double cgpa = sc.nextDouble();
		return cgpa;
	}

}
