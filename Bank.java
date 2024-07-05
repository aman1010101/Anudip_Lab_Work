package com;


public class Bank {
	double amount;
	Bank(double am){
		 amount=am;
	
		
	}
	public void Withdraw(double withdrawlAmount) {
		
		 String result= withdrawlAmount>=amount ? " withdraw Amount successfully" : " Insufficient balance";
		 System.out.println(result);
		 
		 if(withdrawlAmount<=amount) {
			 amount-=withdrawlAmount;
		 }
		 
		 }
	
	public void Deposite(double depositeAmount) {
		amount += depositeAmount;
		
		
	}
	public void DisplayTotalBalance() {
		System.out.println("Total Balance :" +amount);
	}

	public static void main(String[] args) {
		Bank objBank= new Bank(10000);
		objBank.Withdraw(8000);
		objBank.Deposite(3000);
		objBank.DisplayTotalBalance();

	}

}
