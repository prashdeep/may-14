package java_14th_may;

public class WhileLoopDemo {
	
	public static void main(String[] args) {
		int loop = 10;
		while (loop < 10 ) {
			//System.out.println("The current value of loop is "+loop);
			loop++;
		}
		System.out.println("After the while loop has executed");
		
		do {
			System.out.println("The value of loop is "+loop);
			loop++;
		} while(loop < 10);
	}

}
