package com.edureka.jdbc;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * 
 *   use june14;
 	DELIMITER //
 		CREATE  PROCEDURE insertIntoUser(IN id INT, IN name1 VARCHAR(50), IN age1 INT)
     		BEGIN
        		insert into User (id, name, age, salary) values (name1, sal1);
       		END //
  	DELIMITER ;      
 * 
 *   
 */

public class CallableExample {
	public static void main(String[] a) throws IOException, SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/june14", "root", "welcome");
		System.out.println("Connected to the database");

		System.out.println("data base is connected!!!!");
		CallableStatement calstat = con.prepareCall("{call insertIntoUsers(?,?,?)}");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your id =>");
		int id = sc.nextInt();
		System.out.println("enter your name =>");
		String name = sc.next();
		System.out.println("enter your age =>");
		int age = sc.nextInt();

		calstat.setInt(1, id);
		calstat.setString(2, name);
		calstat.setInt(3, age);

		calstat.execute();
		sc.close();
		con.close();
		System.out.println("Your data has been inserted into table.");

	}

}
