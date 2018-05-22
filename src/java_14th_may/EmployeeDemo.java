package java_14th_may;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Suresh", "HR");
		Employee emp2= new Employee(2, "Vinayak", "EBS");
		emp1.applyForLeave(45);
		
		emp1.applyForLeave(4);
		System.out.println(emp1.getLeaveBalance());
		emp1.applyForLeave(2);
		emp1.cancelLeaveApplication(45);
		emp1.cancelLeaveApplication(4);
		emp1.cancelLeaveApplication(45);
		System.out.println(emp1.getLeaveBalance());
		
	}
}
