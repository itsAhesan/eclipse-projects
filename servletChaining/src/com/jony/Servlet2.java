package com.jony;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet 2  receved the request from Servlet 1");
		PrintWriter writer = response.getWriter();
		writer.print("Actually work done by Servlet 2");
		System.out.println("Servlet 2 send response to servlet 1");
	}

}
