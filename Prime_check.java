package com;

import java.util.Scanner;

class Prime_check{
	int n;
	int count=0;
	boolean c= false;
	 Prime_check(){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter an number");
	n= sc.nextInt();
		
	}
	public boolean check() {
		for(int i=1;i<=n; i++) {
			if (n%i==0) {
				count++;
			}
		 }
		if(count==2) {
			 c=true;
		}
		return c;
	
}
	public static void main(String[]args) {
		Prime_check obj=new Prime_check();
		boolean result= obj.check();
		if(result==true) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		}
}
