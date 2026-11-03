package com.langfundamentals;

import java.util.Scanner;

public class EmployeeInfo {
	void getOrgName(String name) {
		System.out.println("the organization name is:" + name);
	}

	void getEmpSalary(double sal) {
		System.out.println("employee salary is:" + sal);
	}

	void getEmpCurrentCity(String city) {
		System.out.println("Employee city is:" + city);
	}

	void getAge(byte age) {
		System.out.println("employee age is:" + age);
	}

	void getEmplId(int id) {
		System.out.println("Employee id is:" + id);
	}

	void getEmpSingleChar(char c) {
		System.out.println("Employee first name is:" + c);
	}

	void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name:");
		String name = sc.nextLine();
		getOrgName(name);
		System.out.println("Enter salary:");
		double sal = sc.nextDouble();
		sc.nextLine();
		getEmpSalary(sal);
		System.out.println("Enter city:");
		String city = sc.nextLine();
		getEmpCurrentCity(city);
		System.out.println("Enter age:");
		byte age = sc.nextByte();
		getAge(age);
		System.out.println("Enter id:");
		int id = sc.nextInt();
		getEmplId(id);
		System.out.println("enter character:");
		char c = sc.next().charAt(1);
		getEmpSingleChar(c);

		sc.close();

	}

}
