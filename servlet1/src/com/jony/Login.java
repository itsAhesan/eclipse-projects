package com.jony;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login implements Servlet{

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		PrintWriter writer = res.getWriter();
		if(user.equals("jony")&&pass.equals("1234")){
			writer.print("<h1 align='center'>Login Successful</h1>");
		}else {
			writer.print("<h1 align='center'>Login Failed</h1>");
			writer.print("<hr><a href='index.html'>Login</a> ");
		}
		
		
		
	}
	
	
	

}
