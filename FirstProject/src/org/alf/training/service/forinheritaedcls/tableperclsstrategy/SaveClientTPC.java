package org.alf.training.service.forinheritaedcls.tableperclsstrategy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.alf.training.entity.inheritance.tableperclsstrategy.NonTeachingStaffTPC;
import org.alf.training.entity.inheritance.tableperclsstrategy.TeachingStaffTPC;

public class SaveClientTPC {
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("FirstProject");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		// Teaching staff entity
		TeachingStaffTPC ts1 = new TeachingStaffTPC(1, "Gopal", "MSc MEd",
				"Maths");
		TeachingStaffTPC ts2 = new TeachingStaffTPC(2, "Manisha", "BSc BEd",
				"English");

		// Non-Teaching Staff entity
		NonTeachingStaffTPC nts1 = new NonTeachingStaffTPC(3, "Satish",
				"Accounts");
		NonTeachingStaffTPC nts2 = new NonTeachingStaffTPC(4, "Krishna",
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