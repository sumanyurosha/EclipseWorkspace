package com.fil.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.fil.dao.SupplyDao;
import com.fil.entitymanager.EntityManagerConnection;
import com.fil.model.Supply;

public class SupplyDaoImpl implements SupplyDao{
	
	EntityManager em = null;

	public SupplyDaoImpl(){
		em = EntityManagerConnection.getConnection();
	}
	@Override
	public void addSupply(Supply s) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
	}

	@Override
	public void deleteSupply(Supply s) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.remove(s);
		em.getTransaction().commit();
	}

	@Override
	public List<Supply> getAllSupply() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Supply");
		List<Supply> list = query.getResultList();
		return list;
	}

	@Override
	public Supply getSupply(int id) {
		// TODO Auto-generated method stub
		Supply s = em.find(Supply.class, id);
		return s;
	}

	@Override
	public void closeManager() {
		// TODO Auto-generated method stub
		em.close();
	}
	

}
