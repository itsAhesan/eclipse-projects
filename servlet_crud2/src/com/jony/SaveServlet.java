package com.jony;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		String add = request.getParameter("add");
		
		Emp e=new Emp();
		e.setName(name);
		e.setAdd(add);
		e.setPass(pass);
		
		int status = EmpDao.save(e);
		
		if(status>0){
			writer.print("<h1>Record Saved Successfully</h1>");
		}else{
			writer.print("<h1>Sorry</h1>");
		}
		
		
		
		
		
	}

}
