package com.edureka.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("sdfdsf");
		list.add("dsfdsf");
		list.get(0);
		list.add("sdfsdfsdf");
		list.add("sdfsdfsdf");
		list.add("sdfsdfsdsdfsdff");
		//list.get(3);
		list.add(0, "Pradeep");
		list.add(1, "Vinay");
		list.add(2, "Ratikant");
		list.add("Pradeep");
		System.out.println("Vinay is present >> "+list.contains("Vinay"));
		
		System.out.println("Index of "+list.lastIndexOf("Pradeep"));
		for (int i = 0; i < list.size(); i ++) {
			System.out.println(list.get(i));
		}

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("sdfsdf"));

		Employee emp = empList.get(0);
		System.out.println(emp.getName());

		System.out.println(empList.contains(emp));
		//empList.remove(0);
		System.out.println(list.indexOf("sdsdsdfsdffsdfsdf"));


		
	}

}

class Employee {
	
	private String name;
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
