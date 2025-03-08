package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.emp.Employee;

public class Update {
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf= cfg.buildSessionFactory();	
		
		Session ss=sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		
		int Eid=1;
		Employee e1= ss.get(Employee.class, Eid);
		
		e1.setRole("Developer");
		
		
		ss.merge(e1);
		//ss.update
		
		System.out.println("Data is updated");
		tr.commit();
		ss.close();
		
}
}
