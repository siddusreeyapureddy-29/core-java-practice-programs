package com.langfundamentals.constructors;

public class FoodOrder {
	int orderid;
	String customername;
	String restaurentname;
	String itemname;
	int quantity;
	double price;

	FoodOrder(int orderid, String customername, String itemname) {
		this.orderid = orderid;
		this.customername = customername;
		this.itemname = itemname;
	}

	FoodOrder(int orderid, String customername, String restaurentname, String itemname, int quantity) {
		this.orderid = orderid;
		this.customername = customername;
		this.restaurentname = restaurentname;
		this.itemname = itemname;
		this.quantity = quantity;

	}

	FoodOrder(int orderid, String customername, String restaurentname, String itemname, int quantity, double price) {
		this.orderid = orderid;
		this.customername = customername;
		this.restaurentname = restaurentname;
		this.itemname = itemname;
		this.quantity = quantity;
		this.price = price;
	}

	FoodOrder() {
		orderid = 104;
		customername = "siddu";
		restaurentname = "meghana";
		itemname = "unknown";
		quantity = 2;
		price = 1000.00;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		FoodOrder order1 = new FoodOrder(101, "shiva", "chicken Biryani");
		order1.displayInfo();
		FoodOrder order2 = new FoodOrder(102, "Reddy", "Paradise", "Mutton Biryani", 2);
		order2.displayInfo();
		FoodOrder order3 = new FoodOrder(103, "Kumar", "Mehfil", "Fried Rice", 3, 450);
		order3.displayInfo();
		FoodOrder order4 = new FoodOrder();
		order4.displayInfo();

	}

	void displayInfo() {
		System.out.println("Order id is:" + orderid);
		System.out.println("Customer name is:" + customername);
		System.out.println("RestaurentName is:" + restaurentname);
		System.out.println("Name of the item is:" + itemname);
		System.out.println("Quantity is:" + quantity);
		System.out.println("price of item is:" + price);
		System.out.println("---------------------------------------------------------");
	}

}
