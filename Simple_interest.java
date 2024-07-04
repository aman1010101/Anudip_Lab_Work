package com;

import java.util.Scanner;

public class Simple_interest {
	float P,R,T;
	
	public void initialize() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter An Principal Amount: ");
		P=sc.nextInt();
		System.out.print("Enter An Rate Of Intrest: ");
		R=sc.nextInt();
		System.out.print("Enter time: ");
		T=sc.nextInt();
		
		
	}
	public void Calculate() {
		System.out.println("Simple Interest is =" + (P*R*T)/100);
	}
	
	public static void main(String[] args) {
		Simple_interest obj = new Simple_interest();
		obj.initialize();
		obj.Calculate();
		
		
	}

}
