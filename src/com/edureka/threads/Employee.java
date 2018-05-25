package com.edureka.threads;

public class Employee {
	
	private String name;
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static void main(String[] args) {
		Employee ram = new Employee("Ram");
		Employee laxman = new Employee("Laxman");
		Employee kiran = new Employee("Kiran");
		Employee vikram = new Employee("Vikram");
		
		PrintManager.managePrinter(ram , 5);
		PrintManager.managePrinter(laxman, 4);
		PrintManager.managePrinter(kiran, 6);
		PrintManager.managePrinter(vikram, 2);
				
	}

}
