package com.demo.FirstHibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Delete details
 */
public class App2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id to delete: ");
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		int id = sc.nextInt();
		Student student = session.get(Student.class, id);
		if (student != null) {
			session.remove(student);
			System.out.println("Student Deleted.");
		} else {
			System.out.println("Student not exist.");
		}
		transaction.commit();
		factory.close();
		sc.close();
	}
}
