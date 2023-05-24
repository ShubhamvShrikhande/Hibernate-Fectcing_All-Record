package com.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Test {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Query query = session.createQuery("from Student");
		List<Students>students = query.list();
		for (Students student : students) {
			System.out.println("ID="+student.getId());
			System.out.println("City="+student.getFisrtname());
			System.out.println("Mobile="+student.getLastname());
			System.out.println("Name="+student.getPhoneNumber());
			System.out.println("Name="+student.getCity());

		}

		session.close();
		sessionfactory.close();
		System.out.println("Record retrieved successfully.");

	}

}
