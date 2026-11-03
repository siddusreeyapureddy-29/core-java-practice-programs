package com.MultiThreading;

class Employeee extends Thread{
	int empid;
	double salary;
	Employeee(int empid,double salary){
		this.empid=empid;
		this.salary=salary;
	}
	
	@Override
	public void run() {
		System.out.println("empid:"+empid+ "salary:"+salary);
	}
}
public class SalaryThread {

	public static void main(String[] args) throws InterruptedException {
		
		Employeee e=new Employeee(1,450000);
		Employeee e1=new Employeee(2,600000);
		Employeee e2=new Employeee(3,980000);
		
		e.start();
		e1.start();
		e2.start();
		
		e.join();
		e1.join();
		e2.join();
		
		double totalSalary=e.salary+e1.salary+e2.salary;
		System.out.println("total salary:"+totalSalary);
		
	}

}
