package com.megh.megha;

import com.megha.entity.Student;
import com.megha.hibernateManager.HibernateManager;

public class Launch {
	public static void main(String[] args) {
		HibernateManager hm=new HibernateManager();
		hm.connect();
		
		Student s=new Student(8, "nithish", "nithish@gmail.com", "565656", 100);
		
		hm.add(s);
	}
}
