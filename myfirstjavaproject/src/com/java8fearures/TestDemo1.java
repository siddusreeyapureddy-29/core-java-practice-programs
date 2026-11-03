package com.java8fearures;

@FunctionalInterface
interface  Calculator{
	int add(int a,int b);
}
public class TestDemo1 {

	public static void main(String[] args) {
		Calculator c=(x,y)->{
			return x+y;
		};
		System.out.println(c.add(10, 20));
	}

}
