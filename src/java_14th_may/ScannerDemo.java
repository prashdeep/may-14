package java_14th_may;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = sc.nextInt();
		System.out.println("Enter another number");
		int j = sc.nextInt();
		System.out.println("Output is "+(i+j));
		sc.close();
		
		char[] array = {'B','O','B'};
		System.out.println(array[0] == array[2]);
	}
}
