package com.Updel;
import java.sql.*;
public class Update_employee {
	public void UpdateData()throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection e= DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","Yoyoganga97");
		Statement s2=e.createStatement();
		s2.executeUpdate("Update Employee set Salary=23 where id=1");
		System.out.println("Data is updated");
		e.close();
		
	}
	
	public void DeletData()throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection e= DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","Yoyoganga97");
		Statement s2=e.createStatement();
		s2.executeUpdate("Delete from Car where id=2 ");
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
	}

	public static void main(String[] args) throws Exception {
		
		
	Update_employee s2=new Update_employee();
	//s2.UpdateData();
	//s2.DeletData();
    s2.getallData();
	}

}
