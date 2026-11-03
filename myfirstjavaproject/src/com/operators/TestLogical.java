package com.operators;

public class TestLogical {

	public static void main(String[] args) {
		int a=6;
		int b=5;
		System.out.println(a++);//6--7
		System.out.println(b++);//5--6
		System.out.println(a--);//7--6
		System.out.println(++a);//7
		System.out.println(++b);//7
		System.out.println(--a);//6
		System.out.println(b--);//7--6
		System.out.println(a++);//6--7
		System.out.println(a--);//7--6
		System.out.println(b++);//6--7
		System.out.println(--a);//5
		System.out.println(++b);//8
		System.out.println(++a);//6
		System.out.println(a);
		System.out.println(b);
		int x=3;
		int n=x++ + ++x + x-- +--x;
		System.out.println(n);
		int m=7;
		int y=m++ + --m + ++m;
		System.out.println(y);
		

	}

}
