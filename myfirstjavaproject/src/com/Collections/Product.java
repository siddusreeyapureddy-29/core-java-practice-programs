package com.Collections;

public class Product {
	int ProductID;
	String ProductName;
	String Category;
	double Price;
	public Product(int productID, String productName, String category, double price) {
		super();
		ProductID = productID;
		ProductName = productName;
		Category = category;
		Price = price;
	}
	@Override
	public String toString() {
		return "Product [ProductID=" + ProductID + ", ProductName=" + ProductName + ", Category=" + Category
				+ ", Price=" + Price + "]";
	}
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	
}
