package com.bridgelabz.javaprograms;

import java.util.Scanner;

public class LeapYear {

	public static boolean leapYear(int year) {

		if (year >= 1582) {

			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				return true;
			}
		}

		return false;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = scan.nextInt();
		boolean result = leapYear(year);
		if (result) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}
}
