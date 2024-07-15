package com;

import java.util.Scanner;

public class Leapyear_or_not {
	int year;

	Leapyear_or_not() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Year");
		year = sc.nextInt();

	}

	public void check() {
		boolean result = false;
		if (year % 4 == 0) {
			result = true;
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					result = true;
				} else {
					result = false;
				}
			}
		} else {
			result = false;
		}
		if (result == true) {
			System.out.println("Given Year is Leap year");
		} else {
			System.out.println("Given Year is not a Leap year");
		}
	}

	public static void main(String[] args) {
		Leapyear_or_not obj = new Leapyear_or_not();
		obj.check();

	}

}
