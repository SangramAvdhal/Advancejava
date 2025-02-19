package com.SS;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.catalina.connector.Response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/empinfo")
public class Employee extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fname=req.getParameter("name1");
		String lname=req.getParameter("name2");
		String role=req.getParameter("role1");
		String Salary=req.getParameter("salary1");
		String joiningdate=req.getParameter("JD1");
		String experiance=req.getParameter("Exp1");
		String city=req.getParameter("city1");
		String country=req.getParameter("con1");
		String email=req.getParameter("mail1");
		String mobno=req.getParameter("mobo1");
		String age=req.getParameter("age1");
		String password=req.getParameter("pass1");
		
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(role);
		System.out.println(Salary);
		System.out.println(joiningdate);
		System.out.println(experiance);
		System.out.println(city);
		System.out.println(country);
		System.out.println(email);
		System.out.println(mobno);
		System.out.println(age);
		System.out.println(password);
		
		
		
		//PrintWriter out = response.getWriter();
		//out.print(fname);
		
	
		

	}
	

}
