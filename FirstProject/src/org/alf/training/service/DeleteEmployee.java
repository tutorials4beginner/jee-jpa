package org.alf.training.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.alf.training.entity.Employee;

public class DeleteEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("FirstProject");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		Employee employee = entitymanager.find(Employee.class, 1201);
		entitymanager.remove(employee);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();

	}

}
