package com.fil.dao;

import java.util.List;

import com.fil.model.Supply;

public interface SupplyDao {
	
	public void addSupply(Supply s);
	public void deleteSupply(Supply s);
	public List<Supply> getAllSupply();
	public Supply getSupply(int id);
	public void closeManager();

}
