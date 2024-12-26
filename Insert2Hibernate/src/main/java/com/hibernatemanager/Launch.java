package com.hibernatemanager;

import com.megha.entity.Employee;

public class Launch {
	public static void main(String[] args) {
		HibernateManager hm=new HibernateManager();
		hm.connect();
		Employee e=new Employee(2, "Hardhik", "hardhik@gmail.com", "hardhik@123", "Mumbai");
		hm.add(e);
	}
}	
