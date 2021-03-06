package com.fil.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("faculty")
public class Faculty extends User{
	
	private String dept;
	private double salary;
	
	public Faculty(){
		
	}
	public Faculty(String name, int userId, String dept, double salary) {
		super(name, userId);
		this.dept = dept;
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
