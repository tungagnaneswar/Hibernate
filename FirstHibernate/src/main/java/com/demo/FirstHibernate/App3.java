package com.demo.FirstHibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Update Details
 */
public class App3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.print("Enter Id to fitch details: ");
		int id = scanner.nextInt();
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Student student = session.get(Student.class, id);
		if (student != null) {
			System.out.println(student.getName() + " " + student.getEmail() + " " + student.getMarks());
			System.out.println("choose attribute to update");
			System.out.println("name | email | marks");
			String ua = scanner.next();
			switch (ua) {
			case "name":
				System.out.println("Enter New Name: ");
				String newName = scanner.next();
				student.setName(newName);
				break;
			case "email":
				System.out.println("Enter New Email: ");
				String newEmail = scanner.next();
				student.setEmail(newEmail);
				break;
			case "marks":
				System.out.println("Enter Updating Marks: ");
				int newMarks = scanner.nextInt();
				student.setMarks(newMarks);
				break;

			default:
				System.out.println("No proper attribute selected Hence no changes");
				break;
			}
			student = session.merge(student);
			transaction.commit();
			System.out.println(student.toString());
			scanner.close();
			session.clear();
			factory.close();
		} else {
			System.out.println("Student not exist..");
		}
	}

}
