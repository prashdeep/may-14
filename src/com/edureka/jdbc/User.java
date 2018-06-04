package com.edureka.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class User {
	
	private int id;
	private String name;
	private int age;
	private double salary;
	private Date dob;
	public User(int id, String name, int age, double salary, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", dob=" + dob + "]";
	}


	public static class UserMapper {
		public static User mapRow(ResultSet resultSet) throws SQLException {
			int id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			int age  = resultSet.getInt(3);
			double salary = resultSet.getDouble(4);
			Date date = resultSet.getDate(5);
			return new User(id, name, age, salary, date);
		}
	}
}
