package com.langfundamentals.constructors;

public class Mobile {
	int mobileid;
	String brand;
	int ram;
	double price;
	
	Mobile(){
		System.out.println("no arg constructor");
	}
	Mobile(int mobileid){
		System.out.println("one arg constructor");
		this.mobileid=mobileid;
	}
	Mobile(Mobile m,String brand){
		System.out.println("two arg constructor called");
		this.mobileid=m.mobileid;
		this.brand=brand;
		
	}
	Mobile(Mobile m,double price){
		System.out.println("three arg constructor");
		this.mobileid=m.mobileid;
		this.brand=m.brand;
		this.price=price;
	}
	
	Mobile(int mobileid,String brand,int ram,double price){
		System.out.println("four arg constructor called");
		this.mobileid=mobileid;
		this.brand=brand;
		this.ram=ram;
		this.price=price;
		
	}

	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.displayMobilInfo();
		Mobile m1=new Mobile(101);
		m1.displayMobilInfo();
		Mobile m2=new Mobile(m1,"oppo");
		m2.displayMobilInfo();
		Mobile m3=new Mobile(m2,7800.00);
		m3.displayMobilInfo();
		
		

	}
	void displayMobilInfo() {
		System.out.println("mobile id is:"+mobileid);
		System.out.println("mobile brand is:"+brand);
		System.out.println("mobile ram is:"+ram);
		System.out.println("mobile price is:"+price);
		System.out.println("------------------------------------");
	}

}
