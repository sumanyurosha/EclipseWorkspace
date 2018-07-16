package com.fil.model;

import javax.persistence.*;

@Entity
@Table(name="part")
public class Part {
	@Id
	private int pid;
	@Column
	private String pname;
	@Column
	private String color;
	public Part(){
		
	}
	public Part(int pid, String pname, String color) {
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
	public String toString(){
		return "pid:"+pid+" pname:" + pname + " color:" + color;
		
	}
	

}
