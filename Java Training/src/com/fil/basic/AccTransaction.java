package com.fil.basic;

public class AccTransaction extends Thread{
	
	Account ac;
	int amount;
	
	AccTransaction(Account ac, int amount){
		this.ac = ac;
		this.amount = amount;
	}
	
	public void run(){
		ac.withdraw(amount);
	}

}