package com.kodnest.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
    public static void main(String[] args) {
        Subject subject = new Subject("Java", "Punith");
        Student student1 = new Student("Eswar", 95, "eswar@kod.com");
        Student student2 = new Student("Arjun", 89, "arjun@email.com");
        subject.addStudent(student1);
        subject.addStudent(student2);

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(subject);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
