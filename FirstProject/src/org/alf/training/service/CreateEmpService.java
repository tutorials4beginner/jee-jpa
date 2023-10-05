package org.alf.training.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.alf.training.entity.Emp;

public class CreateEmpService {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("FirstProject");

		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Emp emp1 = new Emp();
		emp1.setEid(1202);
		emp1.setEname("Gopal");
		
		entitymanager.persist(emp1);
		
		Emp emp2 = new Emp();
		emp2.setEid(1203);
		emp2.setEname("Gopal");
		
		entitymanager.persist(emp2);
		
		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();
	}

}
