package com.edureka.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		Employee2 e1 = new Employee2();
		e1.setId(27);
		e1.setName("Vikram");
		
		Employee2 e2 = new Employee2();
		e2.setId(2454);
		e2.setName("Vikram");
		
		
		Employee2 e3 = new Employee2();
		e3.setId(24);
		e3.setName("Vikram");
		
		Set<Integer> intSet = new TreeSet<>();
		intSet.add(45);
		intSet.add(54);
		intSet.add(60);
		intSet.add(12);
		 
		Set<String>strSet=new TreeSet<>();
		strSet.add("a");
		strSet.add("A");
		strSet.add("c");
		strSet.add("d");
		
		Set<Employee2> empSet = new TreeSet<>();
		
		empSet.add(e2);
		empSet.add(e1);
		empSet.add(e3);
		
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		
		System.out.println(empSet.size());

		empSet.stream().forEach((i)-> System.out.println(i));
		
		Comparator<Employee2> nameComparator = new Comparator<Employee2>() {

			@Override
			public int compare(Employee2 o1, Employee2 o2) {
				// TODO Auto-generated method stub
				return o2.getName().compareTo(o1.getName());
			}
		};
		
		//sort based on name
		Set<Employee2> nameOrderSet = new TreeSet<>(nameComparator);
		nameOrderSet.addAll(empSet);
		nameOrderSet.forEach((i)-> System.out.println(i));
		
		//Set<Employee2> empSet = new TreeSet<>();

		/*empSet.add(e3);
		empSet.add(e2);
		empSet.add(e1);
		System.out.println(empSet.size());
		
		System.out.println(e1);
		
		int i = 45;
		System.out.println(i);
		*/
	}
}


