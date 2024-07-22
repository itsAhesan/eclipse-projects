package com.jony.spring.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.jony.spring.model.UserDTO;

@Component
public class DAO {

	public void saveDTO(UserDTO dto) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("usr");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		entityManager.persist(dto);
		transaction.commit();
		entityManager.close();
		
		
		
		
	}

}
