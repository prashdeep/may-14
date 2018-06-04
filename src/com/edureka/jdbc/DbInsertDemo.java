package com.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbInsertDemo {

	public static void main(String[] args) {

		// Connection connection = null;
		// Statement statement = null;

		// 1. Load the MySQL Driver - Not Needed from Java 8 onwards
		/*
		 * try { Class.forName("com.mysql.jdbc.Driver"); } catch (ClassNotFoundException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 * System.out.println("Driver class Loaded");
		 */
		// 2. Call the DriverManager to get the connection
		//try with resourses
		   /*
		    * This automatically releases the resources which implements AutoClosable interface.
		    */
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/june14", "root", "welcome");
				Statement statement = connection.createStatement();) {

			// 3. From the connection, fetch the statement object

			// 4. From the statement object execute the query.
			statement.execute("insert into user (id, name, age, salary) values (30, 'Vinay', 24, 4000)");
			statement.execute("insert into user (id, name, age, salary) values (32, 'Vikram', 24, 4000)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not create a DB Connection");
			e.printStackTrace();
		}
		
	}
}
