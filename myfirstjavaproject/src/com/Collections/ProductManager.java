package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {

	List<Product> pl=new ArrayList<>();
	
	void addProduct(Product p) {
		pl.add(p);	
		System.out.println("Products added successfully");
	}
	void displayAllProducts() {
		for(Product p:pl) {
			System.out.println(p.toString());
		}
	}
	void findById(int id) {
		for(Product p:pl) {
			if(p.getProductID()==id) {
				System.out.println(toString());
				 return;
			}
		}
		System.out.println("invalid id");
	}
	public void removeById(int id) {
		for(Product p:pl) {
			if(p.getProductID()==id) {
				pl.remove(p);
				System.out.println("product is removed");
				return;
			}
		}
		System.out.println("product is not found");
	}
	void displayByPrice(double amount) {
		for(Product p:pl) {
			if(p.getPrice()>amount) {
				p.toString();
			}
		}
		
	}
}
