package com.kodnest.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyApp {
	public static void main(String[] args) {

		Department department = new Department("Engineering");
		Employee emp1 = new Employee("Eswar", "Software Engineer");
		Employee emp2 = new Employee("Arjun", "Quality Analyst");
		department.addEmployee(emp1);
		department.addEmployee(emp2);

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(department);
		transaction.commit();
		factory.close();

	}
}
