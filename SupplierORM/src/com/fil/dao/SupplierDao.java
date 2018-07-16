package com.fil.dao;

import java.util.List;

import com.fil.model.Supplier;

public interface SupplierDao {
	
	public void addSupplier(Supplier s);
	public Supplier getSupplier(int id);
	public List<Supplier> getAllSupplier();
	public void deleteSupplier(Supplier s);
	public void closeManager();

}
