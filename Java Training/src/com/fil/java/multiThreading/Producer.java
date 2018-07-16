package com.fil.java.multiThreading;

public class Producer extends Thread{
	
	MyQueue q;
	
	
	Producer(MyQueue q){
		this.q = q;
	}
	
	public void run(){
		while(true)
		{
		
			q.put();
		}		
	}
	

}
