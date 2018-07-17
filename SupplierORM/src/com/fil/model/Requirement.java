package com.fil.model;

import javax.persistence.*;

@Entity
public class Requirement {
	
	@Id
	private int reqid;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="pid")
	private Part pid;
	@Column
	private int qty;
	
	public Requirement(){
		
	}
	
	public Requirement(int reqid, Part pid, int qty) {
		super();
		this.reqid = reqid;
		this.pid = pid;
		this.qty = qty;
	}

	public int getReqid() {
		return reqid;
	}

	public void setReqid(int reqid) {
		this.reqid = reqid;
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
	
}
