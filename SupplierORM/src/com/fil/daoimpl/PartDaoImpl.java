package com.fil.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.fil.dao.PartDao;
import com.fil.entitymanager.EntityManagerConnection;
import com.fil.model.Part;

public class PartDaoImpl implements PartDao{
	
	EntityManager em = null;
	
	public PartDaoImpl(){
		em = EntityManagerConnection.getConnection();
	}

	@Override
	public void addPart(Part p) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}

	@Override
	public void deletePart(Part p) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
	}

	@Override
	public List<Part> getAllParts() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Part");
		List<Part> list = query.getResultList();
		return list;
	}

	@Override
	public Part getpart(int id) {
		// TODO Auto-generated method stub
		Part p = em.find(Part.class, id);
		return p;
	}

	@Override
	public void closeManager() {
		// TODO Auto-generated method stub
		em.close();
	}
	
	

}
