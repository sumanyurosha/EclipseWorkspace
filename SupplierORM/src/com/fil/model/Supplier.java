package com.fil.model;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="supplier")
public class Supplier {
	@Id
	private int sid;
	@Column
	private String sname;
	@Column
	private String city;
	@Column
	private Date supdate;
	public Supplier(){
		
	}
	public Supplier(int sid, String sname, String city, Date supdate) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		this.supdate = supdate;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getSupdate() {
		return supdate;
	}
	public void setSupdate(Date supdate) {
		this.supdate = supdate;
	}
	
	public String toString(){
		return "sid:"+sid+" sname:" + sname + " city:" + city + " supdate: " + supdate;
		
	}
	

}
