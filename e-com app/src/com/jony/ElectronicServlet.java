package com.jony;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ElectronicServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		
		ServletContext context = getServletContext();
		String offer = context.getInitParameter("offer");
		
		
		writer.print(offer);
		
		ServletConfig config = getServletConfig();
		String discount = config.getInitParameter("discount");
		
		
		
		writer.print("<br> Electronic discount "+discount);
	}
}
