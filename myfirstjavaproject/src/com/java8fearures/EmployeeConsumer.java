package com.java8fearures;

import java.util.ArrayList;
import java.util.function.Consumer;

class Employee{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
}
public class EmployeeConsumer {
	

	public static void main(String[] args) {
		ArrayList<Employee> em = new ArrayList<>();
		Employee[] e1 = {
				new Employee(101,"manaswini",5000000),
				new Employee(102,"mana",500000),
				new Employee(103,"swini",50000),
				new Employee(104,"manas",5000),
				new Employee(105,"aswini",50000000),
		};
		// Add each Employee object to ArrayList
		  for (Employee e : e1) {
	            em.add(e);
	        }	 
		  // Consumer<Employee>
	        Consumer<Employee> c = (e) -> {
	            System.out.println("ID: " + e.id);
	            System.out.println("Name: " + e.name);
	            System.out.println("Salary: " + e.salary);
	            System.out.println("-------------------");
	        };

//	        // Pass every employee to Consumer
	        for (Employee e : em) {
	            c.accept(e);
	        }
	}

}
