package com.edureka.package1;

public class PrivateModifiedDemo {
	
	private int privateVariable = 100;
	
	private void methodPrivate() {
		System.out.println("Inside the private method.");
	}
	
	void defaultMethod() {
		System.out.println("Default method");
	}
	
	protected void protectedMethod() {
		System.out.println("Inside the protected Method..");
	}
	
	public static void main(String[] args) {
		int var = new PrivateModifiedDemo().privateVariable;
		new PrivateModifiedDemo().methodPrivate();
		new PrivateModifiedDemo().defaultMethod();
		new PrivateModifiedDemo().protectedMethod();
	}
}

class ExtendsPrivate extends PrivateModifiedDemo{
	void myMethod(){
		defaultMethod();
		//methodPrivate();
		protectedMethod();
	
	}
}
