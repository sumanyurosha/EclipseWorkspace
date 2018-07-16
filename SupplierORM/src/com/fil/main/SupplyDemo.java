package com.fil.main;

import java.sql.Date;
import java.util.List;

import com.fil.dao.PartDao;
import com.fil.dao.SupplierDao;
import com.fil.dao.SupplyDao;
import com.fil.daoimpl.PartDaoImpl;
import com.fil.daoimpl.SupplierDaoImpl;
import com.fil.daoimpl.SupplyDaoImpl;
import com.fil.model.Supplier;
import com.fil.model.Supply;

public class SupplyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartDao partDao = new PartDaoImpl();
		SupplierDao supplierDao = new SupplierDaoImpl();
		Supply s = new Supply(11,supplierDao.getSupplier(3), partDao.getpart(2), 20, new Date(System.currentTimeMillis()));
		SupplyDao supplyDao = new SupplyDaoImpl();
		supplyDao.addSupply(s);
		System.out.println(supplyDao.getSupply(s.getSupid()));
		List<Supply> list = supplyDao.getAllSupply();
		for(Supply s1 : list){
			System.out.println(s1);
		}
	}

}
