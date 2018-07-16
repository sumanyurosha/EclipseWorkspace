package com.fil.java.multiThreading;

public class MyQueue {
	boolean itemList;
	int value;
	MyQueue(){
		itemList = false;
		value = 0;
	}
	
	public void put(){
		
		synchronized(this){
			//System.out.println("from put: "+(this.itemList == true));
			while(this.itemList == true){
				//System.out.println("v");
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.itemList = true;
			value++;
			System.out.println("PUT value:" + value);
			notify();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void get(){

		synchronized(this){
			//System.out.println("from get"+(this.itemList == false));
			while(this.itemList == false){
				System.out.println("P");
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			this.itemList = false;
			System.out.println("GET value:" + value);
			notify();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	
		
	}

}
