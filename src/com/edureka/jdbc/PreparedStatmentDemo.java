package com.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatmentDemo {
	
	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/june14", "root", "welcome");
				PreparedStatement ps = connection.prepareStatement("insert into user (id, name, age, salary) values (?, ?, ?, ?)");) {
			
			connection.setAutoCommit(false);
			// compile the query and keep it.
			// pass in the values separately.
			ps.setInt(1,56);
			ps.setString(2,  "Ramesh");
			ps.setInt(3,  60);
			ps.setDouble(4, 45000);
			ps.execute();
			boolean flag = false;
			if(flag)
				throw new NullPointerException("Purposefully throwing NPE");
			
			ps.setInt(1,58);
			ps.setString(2,  "Suresh");
			ps.setInt(3,  24);
			ps.setDouble(4, 30000);
			
			ps.execute();
			connection.commit();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not create a DB Connection");
			e.printStackTrace();
		}
	}

}
