package com.jony;

import java.sql.*;

public class EmpDao {
	public static Connection getConnection(){
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jony?user=root&password=jony1234");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;	
	}
	
	
	public static int save(Emp e) {
		int status=0;
		Connection con= EmpDao.getConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement("insert into servlet(name,pass,add) values (?,?,?)");
			ps.setString(1, e.getName());
			ps.setString(2, e.getPass());
			ps.setString(3, e.getAdd());
			status = ps.executeUpdate();
			
			con.close();
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return status;
		
	}
	
	

}
