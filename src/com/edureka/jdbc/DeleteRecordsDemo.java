package com.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecordsDemo {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/june14", "root", "welcome");
				Statement statement = connection.createStatement();) {
			int rows = statement.executeUpdate("delete from user where id =32 ");
			System.out.println("Number of records deleted is " + rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not create a DB Connection");
			e.printStackTrace();
		}

	}
}
