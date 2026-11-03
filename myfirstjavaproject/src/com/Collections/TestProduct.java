package com.Collections;

public class TestProduct {

	public static void main(String[] args) {
		ProductManager pm=new ProductManager();
		 Product pl=new Product(101,"Laptop","Electronics",890000.00);
		 Product p2=new Product(102,"MobilePhone","Electronics",90000.00);
		 Product p3=new Product(103,"chair","Furniture",8000.00);
		 
		 pm.addProduct(pl);
		 pm.addProduct(p2);
		 pm.addProduct(p3);
		 System.out.println("*******************************");
		 
		 pm.displayAllProducts();
		 
		 pm.findById(103);
		 
//		 pm.displayByPrice(9000);
		 
//		 pm.removeById(102);
	}

}
