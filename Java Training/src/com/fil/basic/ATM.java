package com.fil.basic;

public class ATM {
	public static void main (String args[]) throws InterruptedException{
		Account ac = new Account(10000);
		
		AccTransaction ac1 = new AccTransaction(ac,500);
		AccTransaction ac2 = new AccTransaction(ac,500);
		
		ac1.start();
		ac2.start();
		
		ac1.join();
		ac2.join();
		
	}
	
	

}
