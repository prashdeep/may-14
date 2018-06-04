package com.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTableDemo {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/june14", "root", "welcome");
				Statement statement = connection.createStatement();) {
			int rows = statement.executeUpdate("update user set salary=12000.00 where id =32 ");
			if(rows == 0 ) {
				System.out.println("None of the rows are updated.. ");
			}
			System.out.println("The number of rows that got updated is "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not create a DB Connection");
			e.printStackTrace();
		}

	}
}
