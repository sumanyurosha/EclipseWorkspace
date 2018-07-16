package com.fil.java.multiThreading;

public class PrintDemo{
	
	public static void main(String args[]) throws InterruptedException{
		
		Printer printer = new Printer();
		PrinterUsage pw = new PrinterUsage(printer,"Java");
		PrinterUsage py = new PrinterUsage(printer,"DBMS");
		pw.start();
		py.start();
		pw.join();
		py.join();
		
		
		
	}

}
