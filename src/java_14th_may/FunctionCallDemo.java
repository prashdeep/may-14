package java_14th_may;

public class FunctionCallDemo {
	public static void main(String[] args) {
		int i = 30;
		int j = 45;
		method1(i,j);
		System.out.println("Inside the main method value of i is "+i);
		System.out.println("Inside the main method value of j is "+j);
	}

	private static void method1(int i, int j) {
		System.out.println("The value of i inside method1 is "+i);
		System.out.println("The value of j inside method1 is "+j);
		i = 56;
		j = 78;
		System.out.println("The value of i inside method1 after re setting is "+i);
		System.out.println("The value of j inside method1 after resetting is "+j);
		
	}
}
