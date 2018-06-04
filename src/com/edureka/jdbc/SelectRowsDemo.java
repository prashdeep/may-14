package com.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRowsDemo {
	
	public static void main(String[] args) {
		
		selectAllUsers();

	}

	private static void selectAllUsers() {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/june14", "root", "welcome");
				Statement statement = connection.createStatement();) {
			try(ResultSet resultSet= statement.executeQuery("select * from User")){
				
				while(resultSet.next()) {
					User user = User.UserMapper.mapRow(resultSet);
					System.out.println(user);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not create a DB Connection");
			e.printStackTrace();
		}
	}
	
	private static void selectAllUsersWithSalaryLessThan10K() {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/june14", "root", "welcome");
				Statement statement = connection.createStatement();) {
			try(ResultSet resultSet= statement.executeQuery("select * from User where salary < 10000")){
				
				while(resultSet.next()) {
					User user = User.UserMapper.mapRow(resultSet);
					System.out.println(user);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not create a DB Connection");
			e.printStackTrace();
		}
	}
	
	private static void fetchUserById() {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/june14", "root", "welcome");
				Statement statement = connection.createStatement();) {
			try(ResultSet resultSet= statement.executeQuery("select * from User where id= 23")){
				
				while(resultSet.next()) {
					User user = User.UserMapper.mapRow(resultSet);
					System.out.println(user);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not create a DB Connection");
			e.printStackTrace();
		}
	}

}
