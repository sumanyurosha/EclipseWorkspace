package com.fil.java.multiThreading;

public class ThreadDemo implements Runnable{
	
	public void run(){
		System.out.println("Main Starts here");
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread());	
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
