package com.langfundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestInteger {

	public static void main(String[] args) {
		BigInteger b1 = new BigInteger("7789442316688464221910123456778");
		BigInteger b2 = new BigInteger("6789442316688464221910123456778");
		BigDecimal d1 = new BigDecimal("24513537891098664231.4146729010321145172892");
		BigDecimal d2 = new BigDecimal("2347685082124579.672751431678861532425665");
		System.out.println(b1.add(b2));
		System.out.println(d1.add(d2));
		System.out.println(b1.subtract(b2));
		System.out.println(d1.subtract(d2));
		System.out.println(b1.multiply(b2));
		System.out.println(d1.multiply(d2));
	}

}
