package com.megha.hibernateManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.megha.entity.Student;

public class HibernateManager {
	private Configuration config;
	private SessionFactory sf;
	private Session session;
	private Transaction t;

	public void connect() {
		config=new Configuration();
		config.configure();
		sf=config.buildSessionFactory();
		session=sf.openSession();
	}

	public void add(Student s) {
		t=session.beginTransaction();
		session.persist(s);
		t.commit();
		System.out.println("data inserted sucessfully");
	}
}
