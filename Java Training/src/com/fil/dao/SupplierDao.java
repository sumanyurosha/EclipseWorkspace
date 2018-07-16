package com.fil.dao;

import java.util.List;

import com.fil.model.Supplier;


public interface SupplierDao {
	
	public Supplier getSupplier(int index);
	public List<Supplier> getAllSuppliers();
	public int addSupplier(Supplier s);
	public void deleteSupplier(Supplier s);
	

}