package org.alf.training.service.forinheritaedcls.joinedtablestrategy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.alf.training.entity.inheritance.joinedtablestrategy.NonTeachingStaffJT;
import org.alf.training.entity.inheritance.joinedtablestrategy.TeachingStaffJT;

public class SaveClientJT {
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("FirstProject");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		// Teaching staff entity
		TeachingStaffJT ts1 = new TeachingStaffJT(1, "Gopal", "MSc MEd",
				"Maths");
		TeachingStaffJT ts2 = new TeachingStaffJT(2, "Manisha", "BSc BEd",
				"English");

		// Non-Teaching Staff entity
		NonTeachingStaffJT nts1 = new NonTeachingStaffJT(3, "Satish",
				"Accounts");
		NonTeachingStaffJT nts2 = new NonTeachingStaffJT(4, "Krishna",
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