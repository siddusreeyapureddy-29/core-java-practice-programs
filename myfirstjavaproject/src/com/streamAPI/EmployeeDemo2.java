package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Emp {
    public int id;
    public String name;
    public String dept;
    public double salary;

    public Emp(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Salary: " + salary +
               ", Department: " + dept;
    }
}
public class EmployeeDemo2 {
	
	
	public static void main(String[] args) {
		List<Emp> emp1 = Arrays.asList(
	            new Emp(101, "siddu", "consultant", 590000),
	            new Emp(102, "sai", "finance", 90000),
	            new Emp(103, "triveni", "consultant", 490000),
	            new Emp(104, "manaswini", "finance", 690000),
	            new Emp(105, "supraja", "IT", 50000),
	            new Emp(106, "anwija", "IT", 520000),
	            new Emp(107, "abhay", "finance", 4300000),
	            new Emp(108, "nidhi", "IT", 260000)
	        );
		//Print all employees
		emp1.stream()
		   .collect(Collectors.toList())
		   .forEach(e->System.out.println(e));
		System.out.println("*********************************");
		//print names using map
		emp1.stream()
		    .map(e->e.name)
		    .forEach(System.out::println);
		System.out.println("*********************************");

		//print only salaries using map
		emp1.stream()
		   .map(e->e.salary)
		   .forEach(System.out::println);
		System.out.println("*********************************");

		//emp whose salary is greater than 5000
		emp1.stream()
		   .filter(e->e.salary>5000)
		   .forEach(System.out::println);
		System.out.println("*********************************");
		//emp belong to it department
		emp1.stream()
		   .filter(s->s.dept=="IT")
		   .forEach(System.out::println);
		System.out.println("*********************************");
 
		
		//department wise grouping
		Map<Object, List<Emp>> dept1=emp1.stream()
				                           .collect(Collectors.groupingBy(e->e.dept));
				                           System.out.println("Department wise employee");
		                                   dept1.forEach((dept,EmpList)->{
		                                	   System.out.println(dept+":"+EmpList);
		                                   });
		                                   
		System.out.println("*********************************");
		                                   
		//find the average salary for each department
		Map<Object,Double> average_salary=emp1.stream()
											  .collect(Collectors.groupingBy(e->e.dept,
													  Collectors.averagingDouble(e->e.salary)
													  ));
		System.out.println("Department wise salary");
		average_salary.forEach((dept,avg)->{
			System.out.println(dept+":"+avg);
		});

	}

}
