package com.operators;

public class RelationalOperatorsTest {

	public static void main(String[] args) {
		double d=34.5;
		double e=90.5;
		double f=34.5;
		System.out.println(d==f);//true
		System.out.println(d==e);//false
		System.out.println(d!=e);//true
		System.out.println(d!=f);//false
		System.out.println(d>e);//false
		System.out.println(d<e);//true
		System.out.println(d>=e);//false
		System.out.println(d>=f);//true
		System.out.println(d<=e);//true
		System.out.println(e<=f);//false
		System.out.println(d<=f);//true

	}

}
