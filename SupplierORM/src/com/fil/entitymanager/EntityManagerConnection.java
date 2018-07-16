package com.fil.entitymanager;

import javax.persistence.*;

public class EntityManagerConnection {
	
	private static EntityManager em = null;
	private static EntityManagerFactory factory = null;
	
	private EntityManagerConnection(){
		
		factory = Persistence.createEntityManagerFactory("SupplierORM");
		em = factory.createEntityManager();
		
	}
	
	public static EntityManager getConnection(){
		if(em == null ){
			new EntityManagerConnection();
		}
		
		return em; 
	}

}
