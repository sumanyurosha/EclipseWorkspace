package com.fil.model;

public class Supplier {
	
	private int pid;
	private String pname,color;
	public Supplier(int pid, String pname, String color) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.color = color;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Supplier [pid=" + pid + ", pname=" + pname + ", color=" + color + "]";
	}
	

}
