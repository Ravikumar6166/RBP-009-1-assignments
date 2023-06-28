package com.bridgelabz.javaprograms;

import java.util.Scanner;

public class ComparisonOfStrings {

	public static void main(String[] args) {

		/*
		 * String str1 = "Julin"; String str2 = "Julin"; String str3 = new
		 * String("Julin"); String str4 = "Ravikumar";
		 * 
		 * System.out.println(str1.equals(str2)); System.out.println(str1.equals(str3));
		 * System.out.println(str1.equals(str4));
		 */

		String str1, str2;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First String");
		str1 = scan.nextLine();

		System.out.println("Enter Second String");
		str2 = scan.nextLine();

		if (str1.equals(str2)) {
			System.out.println("Entered string are Equals");
		} else {
			System.out.println("Entered String are Not Equals");
		}
	}

}
