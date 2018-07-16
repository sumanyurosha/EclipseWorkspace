package com.fil.java.multiThreading;

public class ProducerConsumerDemo {
	
	public static void main(String args[]) throws InterruptedException{
		
		MyQueue q = new MyQueue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		p.start();
		c.start();
		p.join();
		c.join();
		System.out.println("Main ends here");
	}

}
