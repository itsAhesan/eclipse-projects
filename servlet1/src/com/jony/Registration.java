package com.jony;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Registration implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stu		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		
		String name = req.getParameter("name");
		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		String number = req.getParameter("number");
		String age = req.getParameter("age");
		String email = req.getParameter("email");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jony?user=root&password=jony1234");
			
			
			PreparedStatement ps = connection.prepareStatement("insert into st values(?,?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, user);
			ps.setString(3, pass);
			ps.setString(4, number);
			ps.setString(5, age);
			ps.setString(6, email);
			ps.executeUpdate();
			System.out.println("data stored");
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		writer.print("<h1 align='center'>Application submitted</h1>");
		
		
		
	}

}
