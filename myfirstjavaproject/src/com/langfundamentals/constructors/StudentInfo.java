package com.langfundamentals.constructors;

public class StudentInfo {
	int sid;
	String sname;
	double marks;
	String course;
	char grade;
	byte age;
	long mobilenum;
	String address;
	boolean hostelstudent;
	double attendance;

	StudentInfo() {
		System.out.println("no arg constructor called");
		sid = 101;
		sname = "siddu";
		marks = 90;
		course = "full stack";
		grade = 'A';
		age = 23;
		address = "chiyyapadu";
		mobilenum = 9908527821L;
		hostelstudent = true;
		attendance = 90;

	}

	StudentInfo(int sid) {
		System.out.println("no arg constructor with one argument");
		this.sid = sid;
	}

	StudentInfo(int sid, String name, double marks) {
		System.out.println("Three parameterized constructor called");
		this.sid = sid;
		this.sname = name;
		this.marks = marks;

	}

	StudentInfo(String course, char grade) {
		System.out.println("Two parameterized constructor called");
		this.course = course;
		this.grade = grade;
	}

	StudentInfo(long mobilenum, String address, boolean hostelstudent, double attendance) {
		System.out.println("four parameterized constructor called");
//		this.age=age;
		this.mobilenum = mobilenum;
		this.address = address;
		this.hostelstudent = hostelstudent;
		this.attendance = attendance;

	}

	StudentInfo(String sname) {
		this.sname = sname;
	}

	StudentInfo(double marks) {
		this.marks = marks;
	}

	StudentInfo(char grade) {
		this.grade = grade;
	}

	StudentInfo(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}

	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo();
		s1.displayInfo();
		StudentInfo s2 = new StudentInfo(103, "triveni", 89);
		s2.displayInfo();
		StudentInfo s3 = new StudentInfo("pfs", 'B');
		s3.displayInfo();
		StudentInfo s4 = new StudentInfo(8897317181L, "chapadu", false, 89.34);
		s4.displayInfo();
		StudentInfo s5 = new StudentInfo(10);
		s5.displayInfo();
		StudentInfo s6 = new StudentInfo("surya narayareddy");
		s6.displayInfo();
		StudentInfo s7 = new StudentInfo(89.6);
		s7.displayInfo();
		StudentInfo s8 = new StudentInfo('A');
		s8.displayInfo();
		StudentInfo s9 = new StudentInfo(104, "Aparna");
		s9.displayInfo();

	}

	void displayInfo() {
		System.out.println("Student id is:" + sid);
		System.out.println("Student name is:" + sname);
		System.out.println("Student marks is:" + marks);
		System.out.println("Student course is:" + course);
		System.out.println("Student grade is:" + grade);
		System.out.println("Student age is:" + age);
		System.out.println("Student mobile number is:" + mobilenum);
		System.out.println("Student address is:" + address);
		System.out.println("Student is hostel student:" + hostelstudent);
		System.out.println("Student attendence is:" + attendance);
		System.out.println("***************************************");

	}

}
