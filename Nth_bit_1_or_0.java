package com;

import java.util.Scanner;

public class Nth_bit_1_or_0 {
	int num,n;
	Nth_bit_1_or_0(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value of num: ");
		num=sc.nextInt();
		System.out.print("Enter the value of n:");
		n=sc.nextInt();
		System.out.println("-----------------------------");
		
	}
	public void Bit() {
		
		String result= (num &(1<<n))==0 ?  "Nth bit is 0 :": "Nth bit is 1 :";
		System.out.println(result);
		
		
	}
	
	

	public static void main(String[] args) {
		Nth_bit_1_or_0 check = new Nth_bit_1_or_0();
		check.Bit();
		
		}


	}


