package com.java8fearures;

@FunctionalInterface
interface Message{
	void printMessage();
}
public class Hello {

	public static void main(String[] args) {
		Message m=()->System.out.println("Hello Java");
		m.printMessage();

	}

}
