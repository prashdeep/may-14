package java_14th_may;

public class ArrayDemo {
	public static void main(String[] args) {
		//declare and initialize the array
		int[] intArray = new int[10];
		
		int startPoint = 45;
		for (int loop = 0; loop < intArray.length; ++loop) {
			intArray[loop] = startPoint;
			startPoint++;
		}
		intArray[5] = 67;
		for (int loop = 0; loop < intArray.length; ++loop) {
			//System.out.println("The element at ["+loop+"] is :"+intArray[loop]);
		}
		
		//second way to declare an array
		int[] first= new int[] {56,78,5,12, 12,78,56};
		//third way to declare an array
		int[] third = {54,32,12,1};
		//fourth way to declare an array
		int fourth[] = {121,1,12,21};
		
		for(int index = 0; index < fourth.length; index++) {
			System.out.println(fourth[index]);
		}
		
		int[] declareArray;
		declareArray = new int[] {11,22,33,44};

	}
}
