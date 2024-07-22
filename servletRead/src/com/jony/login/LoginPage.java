package com.jony.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jony.loginDao.LoginDao;

public class LoginPage extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		String sid = req.getParameter("id");
		int id = Integer.valueOf(sid);
		String name = req.getParameter("name");
		
		PrintWriter writer = res.getWriter();
		
		LoginDao dao= new LoginDao();
		ResultSet rs = dao.loginValidation(id,name);
		
		try {
			if(rs!=null && rs.next()){
				writer.print("<h1 align='center'>Login Successful</h1>");
				writer.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				
			}else{
				writer.print("Login failed");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
