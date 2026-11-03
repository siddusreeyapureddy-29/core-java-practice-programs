package com.langfundamentals.methods;

public class EmploeeSalaryInfo {

	void main() {
		System.out.println("Main method started");
		double sal = getSalaryInfo();
		double bonus = getBonus();
		System.out.println("Total salary is:" + sal);
		System.out.println("Bonus is:" + (sal + bonus));
		int total_mar = totalMarks();
		int avg = averageMarks();
		System.out.println("total marks is:" + total_mar);
		System.out.println("Average marks is:" + (total_mar / 3));
		System.out.println("Product price is" + productPrice());
		System.out.println("discount price is price: " + discountPrice());
		System.out.println("Bank balance is: " + bankBalance());
		System.out.println("monthly rent is:" + monthlyRent());
		System.out.println("yearly income is:" + yearlyIncome());
		System.out.println("electricity bill is:" + elecBill());
		System.out.println("mobile recharge is:" + mobilRecharge());
		System.out.println("simpleIntrest is: " + simpIntrest(10000, 2, 10));
		System.out.println("Area of the square is: " + areaSquare());
		System.out.println("Area of rectangle is: " + areaRectangle(20, 56));
		System.out.println("Perimeter of a rectangle is:" + perimeterRectangle(34, 23));
		System.out.println(avg);

		System.out.println("Main method ended");

	}

	double getSalaryInfo() {
		double totalsalary = 0;
		double sal = 1000000.0;
		double hra = 35000;
		totalsalary = sal + hra;
		return totalsalary;
	}

	double getBonus() {
		double bonus = 10000;
		return bonus;
	}

	int totalMarks() {
		int m1 = 100;
		int m2 = 100;
		int m3 = 90;
		int total = m1 + m2 + m3;
		return total;
	}

	int averageMarks() {
		int avgmarks = 0;
		return avgmarks;
	}

	double productPrice() {
		return 2300.00;
	}

	double discountPrice() {
		return 450.55;
	}

	float bankBalance() {
		return 45000.3f;

	}

	long monthlyRent() {
		return 500000l;

	}

	long yearlyIncome() {
		return 50000000l;
	}

	float elecBill() {
		return 350.00f;

	}

	double mobilRecharge() {
		return 349.00d;

	}

	double simpIntrest(double p, double t, double r) {
		return (p * t * r) / 100;

	}

	long areaSquare() {
		long side = 98;
		long area = side * side;
		return area;
	}

	int areaRectangle(int l, int b) {
		return l * b;
	}

	int perimeterRectangle(int l, int b) {
		return 2 * (l + b);
	}

}
