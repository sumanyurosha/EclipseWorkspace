package com.fil.main;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;

import com.fil.dao.SupplierDao;
import com.fil.daoimpl.SupplierDaoImpl;
import com.fil.entitymanager.EntityManagerConnection;
import com.fil.model.Supplier;

public class PersistenceDemo {
	
	public static void main(String args[]){
		
		SupplierDao dao = new SupplierDaoImpl();
		Supplier s = new Supplier(8,"ndls Enterprises","Karnataka",new Date(System.currentTimeMillis()));
		dao.addSupplier(s);
		System.out.println("Supplier added");
		List<Supplier> list = dao.getAllSupplier();
		for(Supplier s1: list){
			System.out.println(s1);
		}
		System.out.println(dao.getSupplier(6));
		dao.deleteSupplier(s);
		list = dao.getAllSupplier();
		for(Supplier s1: list){
			System.out.println(s1);
		}
		dao.closeManager();
		
		
	}

}
