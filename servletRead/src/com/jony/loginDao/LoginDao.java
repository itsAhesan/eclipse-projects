package com.jony.loginDao;

import java.sql.*;

public class LoginDao {
	public ResultSet loginValidation(int id, String name){
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jony?user=root&password=jony1234");
			System.out.println("Connection done");
			
			PreparedStatement ps = connection.prepareStatement("select * from emp where id=? and name=?");
			ps.setInt(1, id);
			ps.setString(2, name);
			rs = ps.executeQuery();
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

}
