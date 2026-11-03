package com.langfundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestInteger1 {
	BigInteger bd1 = new BigInteger("3346829412564890175314356378899");
	BigInteger bd2 = new BigInteger("1234564890016243564789498272654");
	BigDecimal d1 = new BigDecimal("909823416788992743212.556789243214546479098765432");
	BigDecimal d2 = new BigDecimal("457876543223456789093.123456789009876541234567890");

	public static void main(String[] args) {
		TestInteger1 t1 = new TestInteger1();
		System.out.println(t1.bd1.add(t1.bd2));
		System.out.println(t1.bd1.multiply(t1.bd2));
		System.out.println(t1.bd1.subtract(t1.bd2));

		System.out.println(t1.d1.add(t1.d2));
		System.out.println(t1.d1.multiply(t1.d2));
		System.out.println(t1.d1.subtract(t1.d2));
	}

}
