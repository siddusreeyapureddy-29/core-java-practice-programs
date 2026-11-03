package com.oops.Encapsulation;

class Employe{
	private double salary;
	public void setSalary(double salary) {
		if(salary>0) {
			this.salary=salary;
		}
		else {
			System.out.println("Salary you have entered is incorrect");
		}
	}
	public double getSalary() {
		return salary;
	}
}
public class TestDemo2 {

	public static void main(String[] args) {
		Employe e=new Employe();
		e.setSalary(3000);
		System.out.println(e.getSalary());
		e.setSalary(0);
//		System.out.println(e.getSalary());

	}

}
