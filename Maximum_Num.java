package com;

import java.util.Scanner;

public class Maximum_Num {
	int num1,num2, max;
	Maximum_Num(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number one :");
		num1=sc.nextInt();
		System.out.print("Enter number two :");
		num2= sc.nextInt();
		System.out.println("-------------------------------");
		
		
	}
	public void largest() {
		 max = num1>num2 ? num1: num2;
		 System.out.println("The maximum numer between " +num1+ " and " + num2 + " is ==" + max);
	}

	public static void main(String[] args) {
		 Maximum_Num obj= new  Maximum_Num();
		 obj.largest();
		

	}

}
