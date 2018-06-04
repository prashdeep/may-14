package com.edureka.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class CollectionLoopDemo {
	
	public static void main(String[] args) {
		List<String> list  = new ArrayList<>();
		list.add("Kiran");
		list.add("Kiran1");
		list.add("Kiran2");
		list.add("Kiran3");
		list.add("Kiran4");
		list.add("Kiran5");
		list.add("Kiran6");
		list.add("Kiran7");
		
		List<Integer> intList = new ArrayList<>();
		intList.add(40);
		intList.add(45);
		intList.add(43);
		intList.add(42);
		intList.add(412);
		intList.add(4523);
		intList.add(14);
		intList.add(445);
		
		//first an obvious way
		/*
		 for(int loop = 0; loop < list.size(); loop++) {
			System.out.println(list.get(loop));
		}
		*/
		
		//enhanced for loop
		//for(Integer str: intList) {
			//System.out.println(str);
		//}
		
		//intList.stream().forEach((t)-> {System.out.println(t);});
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			//System.out.println(str);
		}
		
		//Iterating in both the directions.
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			System.out.println("Came inside the while loop");
			String item = listIterator.next();
			System.out.println("Item > "+item);
		}
		System.out.println("**********************************************");
		while(listIterator.hasPrevious()) {
			System.out.println("Came inside the while loop");
			String item = listIterator.previous();
			System.out.println("Item > "+item);
		}
		
		intList.stream().filter(item -> item < 400).forEach( i-> System.out.println(i));
	}


}
