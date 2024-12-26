package com.hibernatemanager;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.megha.entity.Employee;

public class HibernateManager {
	Configuration config;
	private SessionFactory sf;
	private org.hibernate.Session session;
	private Transaction t;

	public void connect() {
		config=new Configuration();
		config.configure();
		sf=config.buildSessionFactory();
		session=sf.openSession();
	}
	public void add(Employee e) {
		t=session.beginTransaction();
		session.persist(e);
		t.commit();
		System.out.println("Data inserted sucessfully");
	}
}	
