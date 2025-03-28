package com.demo.FirstHibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Insert details
 */
public class App {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id,name,marks,email: ");
		Student student = new Student(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());

		// step-1
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		// step-2
		SessionFactory factory = configuration.buildSessionFactory();
		
		// step-3
		Session session = factory.openSession();
		
		// step-4
		Transaction transaction = session.beginTransaction();

		// step-5
		// The method save(Object) from the type Session is deprecated since version 6.0
		// session.save(student); // old version
		session.persist(student); // new version
		
		// step-6
		transaction.commit();
		
		// step-7
		session.close();
		factory.close();
		sc.close();
	}
}
