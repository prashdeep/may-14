package java_14th_may;

public class FunctionOverloadingDemo2 {
	
	public static  void sum(int i, long j) {
		System.out.println(" The sum 1 is "+(i+j));
	}
	
	public static void sum(long i, int j) {
		System.out.println(" The sum 2 is "+(i+j));
	}
	
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		int j = Integer.parseInt(args[0]);
		long i = Integer.parseInt(args[1]);
		sum(i,j);
	}

}
