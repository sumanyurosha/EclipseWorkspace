package com.fil.java.multiThreading;

public class Consumer extends Thread{
	
	MyQueue q;
	boolean itemList = false;
	
	Consumer(MyQueue q){
		this.q = q;
	}
	
	public void run(){
		while(true)
		{
		
		q.get();
		}
	}
}
