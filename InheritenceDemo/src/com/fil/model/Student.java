package com.fil.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("student")
public class Student extends User{
	
	private int rollno;
	private String branch;
	public Student(){
		
	}
	public Student(String name, int userId, int rollno, String branch) {
		super(name, userId);
		this.rollno = rollno;
		this.branch = branch;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

}
