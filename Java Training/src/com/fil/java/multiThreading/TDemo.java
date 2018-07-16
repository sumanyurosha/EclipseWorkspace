package com.fil.java.multiThreading;

public class TDemo {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadDemo obj = new ThreadDemo();
		Thread t1 = new Thread(obj);
		t1.start();
		MyWork t2 = new MyWork();
		MyWork t3 = new MyWork();
		MyWork t4 = new MyWork();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t4.start();
		
		
		System.out.println(Thread.currentThread() + " we are here");
		t4.join();
		
		
		

	}

}
