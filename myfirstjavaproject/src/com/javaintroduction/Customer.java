package com.javaintroduction;

public class Customer {
// whenever there is no values to the variable jvm will automatically gives instance variables
//	declaring the static and instance variables
	static String companyname;
	static int companyid;

	int cid;
	String cname;

	public static void main(String[] args) {
		System.out.println("main method started");
//		accessing static and instance variables
		companyname = "abcde";
		companyid = 101;
		System.out.println("company id:" + companyid); // 0
		System.out.println("company name:" + companyname); // null
//	    we cannot access non static variable in static field so it is showing error	
//		Cannot make a static reference to the non-static field cid
//		Cannot make a static reference to the non-static field cname
//		System.out.println(cid);
//		System.out.println(cname);
//		we can access instance variables by creating the objects
		Customer c1 = new Customer();
		System.out.println("customer1:" + c1.cid); // 0
		System.out.println("customer name:" + c1.cname); // null
		Customer c2 = new Customer();
		System.out.println("company id:" + companyid);
		System.out.println("company name:" + companyname);
		c2.cid = 1;
		c2.cname = "poijgt";
		System.out.println("customer2:" + c2.cid);
		System.out.println("customer name:" + c2.cname);
		Customer c3 = new Customer();
		companyid = 102;
		companyname = "kjhgfd";
		System.out.println("company id:" + companyid);
		System.out.println("company name:" + companyname);
		c3.cid = 2;
		c3.cname = "mnopqt";
		System.out.println("customer2:" + c2.cid);
		System.out.println("customer name:" + c2.cname);

	}

}
