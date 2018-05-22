package java_14th_may;

public class FunctionStackTrace {
	
	public static void main(String[] args) {
		System.out.println("Called inside main method");
		method1();
		System.out.println("Called after method1 is executed");
	}

	private static void method1() {
		System.out.println("Called inside method1 before executing method2");
		method2();
		System.out.println("Called inside method1 after executing method2");
		
	}

	private static void method2() {
		System.out.println("Called inside method2 before executing method2");
		method3();
		System.out.println("Called inside method2 after executing method3");
	}

	private static void method3() {
		System.out.println("Called inside method3");
	}

}
