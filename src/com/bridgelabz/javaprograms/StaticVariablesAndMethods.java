package com.bridgelabz.javaprograms;

public class StaticVariablesAndMethods {

	static int a = 15;
	static int b = 10;

	static void main() {
		System.out.println("main is static method");
	}

	static {
		if (a >= b) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		main();
	}
}
