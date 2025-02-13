package com.Dao;

import java.sql.*;

public class Employee_dao {
	
	
	public void insertdata() throws Throwable
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/204db1","root","Yoyoganga97");
		Statement s=c.createStatement();
		
		s.executeUpdate("insert into employee(id,name, Salary) values (1,'Sam',23)");
		s.executeUpdate("insert into employee(id,name, Salary) values (2,'raj',22)");
		
	}
	public void UpdateData()throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection e= DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","Yoyoganga97");
		Statement s2=e.createStatement();
		s2.executeUpdate("Update Employee set Salary=25 where id=1");
		System.out.println("Data is updated");
		e.close();
		
	}
	
	public void DeletData()throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection e= DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","Yoyoganga97");
		Statement s2=e.createStatement();
		s2.executeUpdate("Delete from Employee where id=2 ");
		System.out.println("Data is deleted");
		e.close();
		
	}
	
	public void getallData() throws Exception
	{
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection e= DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","Yoyoganga97");
		Statement s2=e.createStatement();
		ResultSet rs2=s2.executeQuery("select * from Employee");
		while(rs2.next()) {
			System.out.println(rs2.getInt(1)+ " "+ rs2.getString(2) + " "+ rs2.getInt(3));
		}

	}}
