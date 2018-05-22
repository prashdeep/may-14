package java_14th_may;

public class CallByReferenceDemo {
	
	public static void main(String[] args) {
		int[] array = new int[4];
		array[0] = 20;
		array[1] = 30;
		array[2] = 40;
		array[3] = 50;
		
		method1(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private static void method1(int[] array) {
		array[0] = 200;
		array[1] = 450;
		array[2] = 560;
		array[3] = 780;
		
	}

}
