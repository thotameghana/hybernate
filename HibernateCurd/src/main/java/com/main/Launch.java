package com.main;

import java.util.Scanner;

import com.megha.entity.Employee;
import com.megha.hibernatedaoImpl.HibernateManagerDaoImpl;

public class Launch {
	public static void main(String[] args) {
		HibernateManagerDaoImpl hmd=new HibernateManagerDaoImpl();
		
		hmd.connect();
		System.out.println("Select option: \n1.Insert\n2.FetchAll\n3.fetchOne by id\n4.update\n5.delete");
		int n=new Scanner(System.in).nextInt();
		switch(n) {
			case 1:
				Employee e=new Employee(4, "Hardhik", "h@gmail.com", "1234", "mumbai");
				hmd.add(e);
				break;
			case 2:
				for(Employee employee:hmd.fetchAll()) {
					System.out.println(employee);
				}
				break;
			case 3:
				if(hmd.fetchOne(1)!=null) {
					System.out.println(hmd.fetchOne(1));
				}
				break;
			case 4:
				hmd.update(1, "virat@gmail.com");
				break;
			case 5:
				hmd.delete(1);
				break;
				
				
		}
		
	}
}
