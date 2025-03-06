package com.emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

public static void main(String[] args) {  
	
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Employee.class);
	SessionFactory sf =cfg.buildSessionFactory();
	Session ss =sf.openSession();
	Transaction tr =ss.beginTransaction();


	Employee e =new Employee();
	e.setEid(1);
	e.setName("Sangram");
	e.setMOBO(912344555);
	e.setEmail("sam@gmail.com");
	e.setRole("QA");
	
	ss.persist(e);
	
	
	System.out.println("Data is inserted....");
	
    tr.commit();
    ss.close();
}	
	
	

}
