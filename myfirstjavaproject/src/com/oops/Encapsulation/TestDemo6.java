package com.oops.Encapsulation;

class Age{
	private int age;
	
	public void setAge(int age) {
		if(age>0) {
			this.age=age;
		}else {
			System.out.println("Invalid age");
		}
	}
	public int getAge() {
		return age;
	}
}
public class TestDemo6 {

	public static void main(String[] args) {
		Age a=new Age();
		a.setAge(21);
		System.out.println(a.getAge());
		a.setAge(-10);
	}

}
