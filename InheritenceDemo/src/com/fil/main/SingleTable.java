package com.fil.main;

import com.fil.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fil.model.Faculty;

public class SingleTable {
	
	public static void main(String args[]){
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("InheritenceDemo");
		EntityManager entityManager = factory.createEntityManager();
		
		Student student = new Student("Sumanyu",12,1057,"cse");
		Faculty faculty = new Faculty("Dinesh",39,"CSE",50000);
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		entityManager.persist(faculty);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		factory.close();
		
	}

}
