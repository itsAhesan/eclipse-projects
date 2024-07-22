package com.jony.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.jony.model.Model;

@Component
public class DAO {

	public void save(Model m) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("usr");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		transaction.begin();
		
		entityManager.persist(m);
		
		transaction.commit();
		
		entityManager.close();
		
		
		
		
		
		
		
	}

}
