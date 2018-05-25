package com.edureka.exceptions;

public class NullPointerExceptionDemo {
	public static void main(String[] args) {
		int[] array = new int[4];
		System.out.println("The value of 5th element is "+array[21]);
		System.out.println("Should be printed after the previous statement");
		Person person = null;
		printName(person);
	}
	
	public static void printName(Person person) {
		System.out.println("The name of the person is "+person.getName());
	}

}

class Person{
	private String name;
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
	private int age;
	
}
