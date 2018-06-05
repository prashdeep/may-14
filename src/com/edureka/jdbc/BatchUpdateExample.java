package com.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchUpdateExample {
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/june14", "root", "welcome");
		try (
				PreparedStatement ps = connection.prepareStatement("insert into user (id, name, age, salary) values (?, ?, ?, ?)");) {
			
			connection.setAutoCommit(false);
			// compile the query and keep it.
			// pass in the values separately.
			ps.setInt(1,578);
			ps.setString(2,  "Ramesh");
			ps.setInt(3,  60);
			ps.setDouble(4, 45000);
			ps.addBatch();
			
			boolean flag = true;
			if(flag)
				throw new NullPointerException("Purposefully throwing NPE");
			
			ps.setInt(1,59);
			ps.setString(2,  "Suresh");
			ps.setInt(3,  24);
			ps.setDouble(4, 30000);
			
			ps.addBatch();
			ps.executeBatch();
			connection.commit();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("There is an exception . Roll Back the transaction");
			connection.rollback();
			e.printStackTrace();
		}
	}
}
