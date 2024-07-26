package com;

import java.util.Scanner;

//------------------------------------------------------------------------------------
class LengthBreadthException extends Exception {
	LengthBreadthException(String msg) {
		super(msg);
	}
}

public class Testexceptionn {
	public static void area_perimeter() {
		float length, breadth;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		length = sc.nextFloat();
		System.out.println("Enter breadth");
		breadth = sc.nextFloat();
		try {

			if (length < 0 || breadth < 0) {
				throw new LengthBreadthException("Enter length and breadth in positive");
			}
			System.out.println("Area :" + length * breadth + " cm^2");
			System.out.println("Perimeter :" + 2 * (length + breadth) + "cm");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws LengthBreadthException {
		area_perimeter();

	}
}
//----------------------------------------------------

//-------------------------------------------------------
//class BreadthException extends Exception{
//	BreadthException(String msg){
//		super(msg);
//	}
//}
//-------------------------------------------------------------
