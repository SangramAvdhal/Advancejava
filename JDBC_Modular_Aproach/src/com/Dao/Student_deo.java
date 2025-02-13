package com.Dao;
import java.sql.*;
public class Student_deo {
	
	public void insertdata()throws Exception
	{
		Class.forName("java.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Yoyoganga97");
		PreparedStatement ps=c.prepareStatement("insert into student(id,name,city) values (?,?,?)");
		ps.setInt(1,1);
		ps.setString(2,"Raju");
		ps.setString(3, "latur");
		ps.executeUpdate();
		
		System.out.println("Data inserted...");
		c.close();
		
	}
	
	public void deleteData() throws Exception 
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/204db1","root","Yoyoganga97");
		PreparedStatement ps=c.prepareStatement("delete from Student where id=?");
		ps.setInt(1,1);
		ps.executeUpdate();
		System.out.println("data deleted..");
		c.close();
		
	}
	public void update() throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/204db1","root","Yoyoganga97");
		PreparedStatement ps=c.prepareStatement("update Student set name=? where id=?");
		ps.setInt(2, 3);
		ps.setString(1, "Avi");
		ps.executeUpdate();
		System.out.println("Data Updated");
		c.close();
	}
	public void fetch() throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/204db1","root","Yoyoganga97");
		PreparedStatement ps=c.prepareStatement("select * from Student");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) 
		{
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
	    }

   }
	}
