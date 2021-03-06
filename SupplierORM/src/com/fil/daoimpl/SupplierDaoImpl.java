package com.fil.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.fil.dao.SupplierDao;
import com.fil.entitymanager.EntityManagerConnection;
import com.fil.model.Supplier;

public class SupplierDaoImpl implements SupplierDao{
	
	EntityManager em;
	
	public SupplierDaoImpl(){
		em = EntityManagerConnection.getConnection();
	}

	@Override
	public void addSupplier(Supplier s) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		
	}

	@Override
	public Supplier getSupplier(int id) {
		// TODO Auto-generated method stub
		Supplier s = em.find(Supplier.class, id);
		return s;
	}

	@Override
	public List<Supplier> getAllSupplier() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Supplier");
		List<Supplier> resultSet = query.getResultList();
		return resultSet;
	}

	@Override
	public void deleteSupplier(Supplier s) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.remove(s);
		em.getTransaction().commit();
	}
	public void closeManager(){
		em.close();
	}

}
