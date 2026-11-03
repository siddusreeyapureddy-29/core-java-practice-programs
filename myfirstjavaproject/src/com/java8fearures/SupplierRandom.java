package com.java8fearures;

import java.util.function.Supplier;

public class SupplierRandom {

	public static void main(String[] args) {
		
		Supplier<Integer> s1 = ()->{
			  return (int) (Math.random() * 100);
		};
		System.out.println(s1.get());
	}

}
