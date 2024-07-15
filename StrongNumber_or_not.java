package com;

import java.util.Scanner;

public class StrongNumber_or_not {

	public static int factorial(int endnum) {
		int f = 1;
		for (int i = 1; i <= endnum; i++) {
			f = f * i;
		}
		return f;

	}

	public static void main(String[] args) {
		int num, copynum;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number");
		num = sc.nextInt();
		copynum = num;

		while (num != 0) {
			int endnum = num % 10;
			sum += factorial(endnum);
			num /= 10;
		}
		if (sum == copynum) {
			System.out.println("Number is Strong number");
		} else {
			System.out.println("Number is not an Strong number");
		}
	}

}
