package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.emp.Employee;

import com.emp.Employee;

public class Delete {
public static void main(String[] args) {
	
	
	
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Employee.class);
	SessionFactory sf= cfg.buildSessionFactory();	
	Session ss =sf.openSession();
	Transaction tr =ss.beginTransaction();	
	
	Employee e =new Employee();
	e.setName("om");
	


}
}
