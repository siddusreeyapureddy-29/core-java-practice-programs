package com.langfundamentals.constructors;

public class Car {
	int carId;
	String brand;
	String model;
	double price;
	String color;
	int year;

	Car() {
		System.out.println("no arg constructor");
		carId = 101;
		brand = "unknown";
		model = "unknown";
		price = 10000000.00;
		color = "white";
		year = 2025;
	}

	Car(int carId) {
		System.out.println("one arg constructor");
		this.carId = carId;
	}

	Car(int carId, String brand) {
		System.out.println("two arg constructor");
		this.carId = carId;
		this.brand = brand;

	}

	Car(int carId, String brand, String model) {
		System.out.println("three arg constructor");
		this.carId = carId;
		this.brand = brand;
		this.model = model;
	}

	Car(int carId, String brand, String model, double price) {
		System.out.println("four arg constructor");
		this.carId = carId;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	Car(int carId, String brand, String model, double price, String color) {
		System.out.println("five arg constructor");
		this.carId = carId;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.carInfo();
		Car c1 = new Car(102);
		c1.carInfo();
		Car c2 = new Car(103, "tata");
		c2.carInfo();
		Car c3 = new Car(104, "tata", "unknown");
		c3.carInfo();
		Car c4 = new Car(105, "texas", "hhhhhhh", 200000000.00);
		c4.carInfo();
		Car c5 = new Car(106, "keara", "abcde", 130000000.00, "red");
		c5.carInfo();

	}

	void carInfo() {
		System.out.println("car id is:" + carId);
		System.out.println("car brand is:" + brand);
		System.out.println("car  model is:" + model);
		System.out.println("car price is:" + price);
		System.out.println("car color is:" + color);
		System.out.println("--------------------------------------");
	}

}
