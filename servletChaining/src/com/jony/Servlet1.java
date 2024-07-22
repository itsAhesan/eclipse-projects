package com.jony;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("Servlet 1 accept the request");
		
		/*RequestDispatcher dispatcher = request.getRequestDispatcher("Servlet2");
		dispatcher.include(request, response);*/
		response.sendRedirect("Servlet2");
		PrintWriter writer = response.getWriter();
		
		System.out.println("Servlet 1 receved the response from servlet 2");
		writer.print("<br>Now Servlet 1 giving the fake response");
		
		
	}

}
