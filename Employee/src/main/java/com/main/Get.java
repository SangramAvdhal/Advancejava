package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;

import com.emp.Employee;

import jakarta.persistence.criteria.Root;

public class Get {
	public static void main(String[] args) {
		
		Configuration cfg =new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();		
	    Session ss =    sf.openSession();
	    Transaction tr =ss.beginTransaction();
	    
	    HibernateCriteriaBuilder hcb =ss.getCriteriaBuilder();	
	    JpaCriteriaQuery<Object> cq =hcb.createQuery();	
	    Root<Employee> root =cq.from(Employee.class);
	    
	    cq.select(root);
	    
	    Query<Object> query =ss.createQuery(cq);
	    java.util.List<Object> list =query.getResultList();
	    
	    for(Object employee :list)
	    {
	    	System.out.println(employee);
	    }
	    
	     
	
	
	
	
	}

}
