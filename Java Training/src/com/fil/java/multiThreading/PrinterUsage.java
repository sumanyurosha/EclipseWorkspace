package com.fil.java.multiThreading;

public class PrinterUsage extends Thread{
	
	Printer printer;
	String msg;
	public PrinterUsage(Printer printer, String msg) {
		super();
		this.printer = printer;
		this.msg = msg;
	}
	
	synchronized public void run(){
		
		printer.print(msg);
		
	}
	

}
