package com.edureka.collections;

import java.util.HashSet;
import java.util.Set;

public class HashCodeDemo {
	public static void main(String[] args) {
		Employee2 e1 = new Employee2();
		e1.setId(23);
		e1.setName("kishore");
		
		Employee2 e2 = new Employee2();
		e2.setId(23);
		e2.setName("Kishore");
		
		
		Employee2 e3 = new Employee2();
		e3.setId(24);
		e3.setName("Kishore");
		
		
		/*e.setId(34);
		e.setName("Pradeep");
		System.out.println(e.hashCode());
		Employee2 e2 = new Employee2();
		e2.setId(56);
		e2.setName("Rama");
		System.out.println(e2.hashCode());
		
		Employee2 e3 = new Employee2();
		Employee2 e4 = e3;
		e3.setId(56);
		e3.setName("Rama");
		
		Employee2 e5 = new Employee2();
		e5.setId(56);
		e5.setName("Rama");

		Set<Employee2> empSet = new HashSet<>();
		empSet.add(e5);
		empSet.add(e4);
		empSet.add(e3);
		empSet.add(e2);
		empSet.add(e);
		System.out.println(empSet.size());*/
		
		Set<Employee2> empSet = new HashSet<>();

		empSet.add(e3);
		empSet.add(e2);
		empSet.add(e1);
		System.out.println(empSet.size());
		
		System.out.println(e1);
		
		int i = 45;
		System.out.println(i);
	}
}

class Employee2 implements Comparable<Employee2>{
	
	
	private int id;
	private String name;
	
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee2 other = (Employee2) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "[empId: "+this.id+", empName: "+name+"]";
	}
	
	@Override
	public int compareTo(Employee2 o) {
		if (this.id > o.id) {
			return 1;
		} else if(this.id < o.id){
			return -1;
		}
		return 0;
		
		
	}
	
}
