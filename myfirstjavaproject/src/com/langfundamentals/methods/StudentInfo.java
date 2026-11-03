package com.langfundamentals.methods;

public class StudentInfo {

	void main() {
		System.out.println("Main method started");
		getFullName("Siddu Sai Triveni");
		getFatherName("Surya Narayana Reddy");
		getMotherName("Aparna");
		getFirstName("Siddu");
		getSecondName("Sai");
		getLastName("Triveni");
		getAddress("Chiyyapadu village chapadu mandal kadapa district");
		getCourse("Full Stack Java ");
		getInstName("Vcube Software Solutions");
		String curr_city=getCurrentCity();
		System.out.println("Current city is:"+curr_city);
		char gender=getGender('f');
		System.out.println("Gender is:"+gender);
		
		System.out.println("Main method ended");

	}
	void getFullName(String name) {
		System.out.println("Student name is:"+name);
	}
	void getFatherName(String fname) {
		System.out.println("Father name is:"+fname);
	}
	void getMotherName(String mname) {
		System.out.println("Mother name is:"+mname);
	}
	void getFirstName(String firname) {
		System.out.println("First name is:"+firname);
	}
	void getSecondName(String sname) {
		System.out.println("Second name is:"+sname);
	}
	void getLastName(String lname) {
		System.out.println("Last name is:"+lname);
	}
	String getAddress(String address) {
		return address;
	}
	String getCourse(String course) {
		return course;
	}
	String getInstName(String insname) {
		return insname;
	}
	String getCurrentCity() {
		String currcity="Hyderabad";
		return currcity;
	}
	char getGender(char g) {
		return g;
	}
}
