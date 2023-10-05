package org.alf.training.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.alf.training.entity.Employee;

public class CreateEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("FirstProject");

		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		Employee employee = new Employee();
		employee.setEid(1201);
		employee.setEname("Gopal");
		employee.setSalary(40000);
		employee.setDeg("Technical Manager");

		entitymanager.persist(employee);
		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();

	}

}
