package com.langfundamentals.constructors;

public class Test  {
    Test() {
        System.out.println("A");
    }
}

class B extends Test {

    B() {
        this(10);
        System.out.println("B");
    }

    B(int x) {
        this(10, 20);
        System.out.println("C");
    }

    B(int x, int y) {
        System.out.println("D");
    }

    public static void main(String[] args) {
        new B();
    }
}

	