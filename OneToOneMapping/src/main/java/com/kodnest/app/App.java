package com.kodnest.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        ProductImage productImage = new ProductImage("http://bunnynet.com/images/pant.png");
        Product product = new Product("Redtape Pant", 599, 40, productImage);
        
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(product);
        transaction.commit();
        session.close();
        factory.close();
    }
}
