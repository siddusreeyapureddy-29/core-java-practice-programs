package com.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
    public int id;
    public String name;
    public String dept;
    public double salary;

    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}

public class ResversedOrder {

    public static void main(String[] args) {

        List<Employee> emp = Arrays.asList(
            new Employee(101, "siddu", "finance", 5900000),
            new Employee(102, "sai", "finance", 900000),
            new Employee(103, "triveni", "finance", 4900000),
            new Employee(104, "manaswini", "finance", 6900000),
            new Employee(105, "supraja", "finance", 50000),
            new Employee(106, "anwija", "finance", 5200000),
            new Employee(107, "abhay", "finance", 4300000),
            new Employee(108, "nidhi", "finance", 2600000)
        );

        emp.stream()
           .map(e -> e.salary)
           .distinct()
           .sorted(Comparator.reverseOrder())
           .skip(1)
           .limit(1)
           .forEach(System.out::println);
//        
//        emp.stream()
//        .map(e -> e.salary)
//        .distinct()
//        .sorted(Comparator.reverseOrder())
//        forEach(System.out::println);
    }
}