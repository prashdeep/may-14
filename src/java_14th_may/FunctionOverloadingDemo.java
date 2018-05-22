package java_14th_may;

public class FunctionOverloadingDemo {

	public static void greet() {
		System.out.println("Hi!!");
	}
	
	public static void greet(String message) {
		System.out.println("Hi "+message);
	}
	
	public static void greet(int i, String message) {
		for (int loop = 0; loop < i; loop++) {
			System.out.println("Hi "+message);
		}
	}
	
	public static void greet(String message, int i) {
		for (int loop = 0; loop < i; loop++) {
			System.out.println("Hi "+message);
		}
	}
	
	public static void greet(String message, String name) {
			System.out.println("Hi !!" +name +" " +message);
	}
	public static void main(String[] args) {
		greet("Good Morning ", "Pradeep");
	}
}
