package com.fil.basic;

public class Account {
	int balance;
	
	Account(int balance){
		this.balance = balance;
	}
	
	
	synchronized public void withdraw(int amount){
		this.setBalance(this.getBalance()-amount);
		System.out.println(this.getBalance());
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}


	public int getBalance() {
		return balance;
	}

}
