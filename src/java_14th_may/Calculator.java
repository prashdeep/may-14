package java_14th_may;

public class Calculator {

	public static int sum(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println("This is the entry point of the main method");
		int result = sum(45,40);
		System.out.println(result);
		subtract(56, 44);
	}

	/*public static void add(int a, int b) {
		System.out.println("The sum of a and b is "+(a+b));
	}
	*/
	public static void subtract(int a, int b) {
		System.out.println("The subtraction of a and b is "+(a-b));
	}
	


}
