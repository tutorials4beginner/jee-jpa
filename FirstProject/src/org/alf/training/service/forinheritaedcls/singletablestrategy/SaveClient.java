package org.alf.training.service.forinheritaedcls.singletablestrategy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.alf.training.entity.inheritance.singletablestrategy.NonTeachingStaff;
import org.alf.training.entity.inheritance.singletablestrategy.TeachingStaff;

public class SaveClient {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("FirstProject");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		// Teaching staff entity
		TeachingStaff ts1 = new TeachingStaff(1, "Gopal", "MSc MEd", "Maths");
		TeachingStaff ts2 = new TeachingStaff(2, "Manisha", "BSc BEd",
				"English");

		// Non-Teaching Staff entity
		NonTeachingStaff nts1 = new NonTeachingStaff(3, "Satish", "Accounts");
		NonTeachingStaff nts2 = new NonTeachingStaff(4, "Krishna",
				"Office Admin");

		// storing all entities
		entitymanager.persist(ts1);
		entitymanager.persist(ts2);
		entitymanager.persist(nts1);
		entitymanager.persist(nts2);

		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();
	}
}
