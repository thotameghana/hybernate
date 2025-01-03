package com.megha.hibernatedaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.megha.entity.Employee;
import com.megha.hibernatedao.HibernateManagerDao;

public class HibernateManagerDaoImpl implements HibernateManagerDao {

	private Session session;
	private Transaction t;
	List<Employee> employeeList;

	public void connect() {
		session=new Configuration().configure().buildSessionFactory().openSession();
	}
	@Override
	public void add(Employee e) {
		t=session.beginTransaction();
		session.persist(e);
		t.commit();
		System.out.println("data inserted");
	}

	@Override
	public List<Employee> fetchAll() {
		employeeList=session.createQuery("from Employee").list();
		return employeeList;
		
	}
	
	//if it is a primary key
	@Override
	public Employee fetchOne(int eid) {
		Employee e=session.get(Employee.class,eid);
		return e;
	}

	@Override
	public void update(int eid, String email) {
		Employee e=session.get(Employee.class, eid);
		if(e!=null) {
			t=session.beginTransaction();
			e.setEmail(email);
			t.commit();
			System.out.println("updated sucessfully");
		}
		else {
			System.out.println("No user found with that eid");
		}
	}

	@Override
	public void delete(int eid) {
		Employee e=session.get(Employee.class, eid);
		if(e!=null) {
			t=session.beginTransaction();
			session.delete(e);
			t.commit();
			System.out.println("deleted sucessfully");
		}
		else {
			System.out.println("No user found with that email");
		}
	}

}
