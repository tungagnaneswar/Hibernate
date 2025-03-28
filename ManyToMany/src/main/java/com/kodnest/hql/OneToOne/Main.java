package com.kodnest.hql.OneToOne;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		String hql = "from Employee where salary > 2000";
		Query query  = session.createQuery(hql, Employee.class);
		List<Employee> emplist = query.getResultList();
		for (Employee emp : emplist) {
			System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());
		}
		transaction.commit();
		session.close();
		factory.close();
	}

}
