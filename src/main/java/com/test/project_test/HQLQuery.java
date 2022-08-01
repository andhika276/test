package com.test.project_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


@SpringBootApplication
public class HQLQuery {

	public static void main(String[] args) {
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		   
		//Bagian ini adalah contoh query pada HQL yang nantinya digunakan untuk mengquery database di postgre
		Query query =session.createQuery("from employee");
		List users = query.list();

		session.getTransaction().commit();
		session.close();
		//System.out.println("Size of list result =" users.size());
		
	}

}
