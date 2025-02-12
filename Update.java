package com.Updel;
import java.sql.*;
public class Update_car {
	public void UpdateData()throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","Yoyoganga97");
		Statement s1=c.createStatement();
		s1.executeUpdate("Update Car set Model='Caren' where Comapny_name='kia'");
		System.out.println("Data is updated");
		c.close();
		
	}
	
	public void DeletData()throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","Yoyoganga97");
		Statement s1=c.createStatement();
		s1.executeUpdate("Delete from Car where Comapny_name='tata' ");
		System.out.println("Data is deleted");
		c.close();
		
	}
	
	public void getallData() throws Exception
	{
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","Yoyoganga97");
		Statement s1=c.createStatement();
		ResultSet rs1=s1.executeQuery("select * from Car");
		while(rs1.next()) {
			System.out.println( rs1.getString(1) + " "+ rs1.getString(2));
		}
	}

	public static void main(String[] args) throws Exception {
		
		
	Update_car s1=new Update_car();
	s1.UpdateData();
	s1.DeletData();
    s1.getallData();
	}

}
