package com.kodnest.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Course c1 = new Course();
		c1.setTitle("Java");
		Course c2 = new Course();
		c2.setTitle("MySQL");
		Student s1 = new Student();
		s1.setName("Eswar");
		Student s2 = new Student();
		s2.setName("Arjun");

		List<Course> clist = new ArrayList<Course>();
		clist.add(c1);
		clist.add(c2);
		List<Student> slist = new ArrayList<Student>();
		slist.add(s1);
		slist.add(s2);

		c1.setStulist(slist);
		c2.setStulist(slist);
		s1.setCourselist(clist);
		s2.setCourselist(clist);

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(s1);
		session.persist(s2);
		transaction.commit();
		session.close();
		factory.close();
	}
}
