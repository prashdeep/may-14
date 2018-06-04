package com.edureka.innerclass;

abstract class MyAbstractClass {
	 abstract void abMethod();
}

  @FunctionalInterface
 interface Greet{
	 String greet(String message);
	}
 
 class HelloGreet implements Greet{

	@Override
	public String greet(String message) {
		return "Hello!! "+message;
	}
	 
 }
 
 class HiGreet implements Greet{

	@Override
	public String greet(String message) {
		// TODO Auto-generated method stub
		return "Hi!! "+message;
	}
	 
 }
 



public class AnonymousInnerClassDemo {
	public static void main(String[] args) {
		Greet greetings = new HiGreet();
		///System.out.println(greetings.greet("Good Morning"));
		
		Greet myNewAnonymousGreet = new Greet() {
			@Override
			public String greet(String message) {
				return "Welcome !! " +message;
			}
		};
		
		Greet myNewGreet = (message) -> "Welcome !! " +message;
		System.out.println(myNewGreet.greet("Pradeep"));;
		
		
		
	}

}
