package com.operators;

public class SmartPhone {
	int ProductId;
	String ProductName;
	String Brand;
	double Price;
	double Warrenty;

	SmartPhone() {
		System.out.println("Smart phone no arg constructor called");
	}

	public SmartPhone(int productId, String productName, String brand, double price, double warrenty) {
		this.ProductId = productId;
		this.ProductName = productName;
		this.Brand = brand;
		this.Price = price;
		this.Warrenty = warrenty;
	}
	SmartPhone(SmartPhone S){
		this.ProductId=S.ProductId;
		this.ProductName=S.ProductName;
		this.Brand=S.Brand;
		this.Price=S.Price;
		this.Warrenty=S.Warrenty;
		
	}

	public static void main(String[] args) {
		SmartPhone s = new SmartPhone(101,"Realme 11X 5g","Realme",15999,1);
		System.out.println("Original smart Phone records");
		s.display();
		SmartPhone s1=new SmartPhone(s);
		System.out.println("Copied smart phone record");
		s1.display();
		
		

	}
	void display() {
		System.out.println("Product id is:"+ProductId);
		System.out.println("Product name is:"+ProductName);
		System.out.println("Product brand is:"+Brand);
		System.out.println("Product Price is:"+Price);
		System.out.println("Product warrenty is:"+Warrenty);
		

	}

}
