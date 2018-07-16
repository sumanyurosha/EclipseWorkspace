package com.fil.model;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="supply")
public class Supply {
	@Id
	private int supid;
	@ManyToOne (fetch=FetchType.EAGER)
	@JoinColumn(name="sid")
	private Supplier sid;
	@ManyToOne (fetch=FetchType.EAGER)
	@JoinColumn(name="pid")
	private Part pid;
	@Column
	private int qty;
	@Column
	private Date supdate;
	
	public Supply(){
		
	}
	
	public Supply(int supid, Supplier sid, Part pid, int qty, Date supdate) {
		super();
		this.supid = supid;
		this.sid = sid;
		this.pid = pid;
		this.qty = qty;
		this.supdate = supdate;
	}

	public int getSupid() {
		return supid;
	}

	public void setSupid(int supid) {
		this.supid = supid;
	}

	public Supplier getSid() {
		return sid;
	}

	public void setSid(Supplier sid) {
		this.sid = sid;
	}

	public Part getPid() {
		return pid;
	}

	public void setPid(Part pid) {
		this.pid = pid;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Date getSupdate() {
		return supdate;
	}

	public void setSupdate(Date supdate) {
		this.supdate = supdate;
	}

	public String toString(){
		return "supid:" + supid + " Supplier:" + sid + " Part:" + pid + " qty:" + qty + " supdate: " + supdate;
	}
	

}
