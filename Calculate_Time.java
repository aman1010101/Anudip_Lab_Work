package com;

import java.util.Scanner;

public class Calculate_Time {
	double Speed, Distance;
	public void initialize() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Value of Speed(km/hr): " );
		Speed =sc.nextDouble();
		System.out.print("Enter the Value of Distance(km): "  );
		Distance= sc.nextDouble();
		}
	public void Time_cal() {
		double Time=Distance/ Speed;
		System.out.println("Time taken: "+ Time + "hr");
		
		
	}

	public static void main(String[] args) {
		Calculate_Time obj= new Calculate_Time();
		obj.initialize();
		obj.Time_cal();
		

	}

}
