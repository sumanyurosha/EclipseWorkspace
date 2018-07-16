package com.fil.java.multiThreading;

public class MyWork extends Thread{
	
	public void run(){
		System.out.println("MyWork starts here!");
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
