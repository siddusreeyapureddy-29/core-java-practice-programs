package com.oops.Encapsulation;

class Employee {
	private double salary;

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
}

public class TestDemo4 {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setSalary(2500);
		System.out.println(e.getSalary());
	}

}
