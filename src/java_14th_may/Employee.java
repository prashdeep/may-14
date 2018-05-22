package java_14th_may;

import java.util.Date;

public class Employee {
	private long empId;
	private String empName;
	private Date joiningDate;
	private String department;
	private int leaveBalance = 50;
	
	public Employee(long empId, String empName, String dept) {
		this.empId = empId;
		this.empName = empName;
		this.department = dept;
	}
	public Employee(long empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public int getLeaveBalance() {
		return leaveBalance;
	}

	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void applyForLeave(int numberOfDays) {
		if (this.leaveBalance > numberOfDays) {
			this.leaveBalance = this.leaveBalance - numberOfDays;
		}else {
			System.out.println("You do not have enough leave balance");
		}
	}
	
	public void cancelLeaveApplication(int numberOfDays) {
		if (!(this.leaveBalance + numberOfDays > 50)) {
			this.leaveBalance = this.leaveBalance+numberOfDays;
		}
	}
	
	public void switchDepartment(String deptName) {
		this.department = deptName;
	}
}
