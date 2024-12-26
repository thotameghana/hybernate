package com.megha.hibernatedao;

import java.util.List;

import com.megha.entity.Employee;

public interface HibernateManagerDao {
	void add(Employee e);
	List<Employee> fetchAll();
	Employee fetchOne(int eid);
	void update(int eid,String email);
	void delete(int id);
}
