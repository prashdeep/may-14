package com.edureka.innerclass;

 class Emplyoyee {
	
	private int name;
	private int age;
	private double salary;
	private int leaveBalance;
	
	private static int noOfEmployees = 50;
	
	
	
	public static int getNoOfEmployees() {
		return noOfEmployees;
	}

	public static void setNoOfEmployees(int argNoOfEmployees) {
		noOfEmployees = argNoOfEmployees;
	}

	public Emplyoyee(int leaveBalance) {
		this.leaveBalance = leaveBalance;
	}
	
	public int getLeaveBalance() {
		return leaveBalance;
	}
	public void setLeaveBalance(int leaveBalance) {
		this.leaveBalance = leaveBalance;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
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
	
	static class ManageEmployee{
		
		public static int getEmployeeCount() {
			return noOfEmployees;
		}
		/*public int applyForLeave(int noOfDays){
			int newLeaveBalance = leaveBalance;
			if (leaveBalance > noOfDays){
				newLeaveBalance = leaveBalance - noOfDays;
			}else {
				System.out.println("You cannot apply for leave");
			}
			return newLeaveBalance;
		}*/
	}
}
 
 public class OuterClassDemo {
	 public static void main(String[] args) {
		//very very important
		//Emplyoyee.ManageEmployee manageEmployee = new Emplyoyee(50).new ManageEmployee();
		//int remaingingLeaveBalance = manageEmployee.applyForLeave(45);
		//System.out.println("The remaining leave balance is "+remaingingLeaveBalance);
		Emplyoyee.ManageEmployee ref = new Emplyoyee.ManageEmployee();
		System.out.println(ref.getEmployeeCount());
	}
 }
 
