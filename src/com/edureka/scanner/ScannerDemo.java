package com.edureka.scanner;

import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
		System.out.println("Please enter your name");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Hi "+name);
		System.out.println("Please enter your options");
		System.out.println("Option 1: Deposit");
		System.out.println("Option 2: Withdraw");
		System.out.println("Option 3: View Balance");
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			System.out.println("Deposit money");
			break;
		case 2:
			System.out.println("Withdraw");
			break;
		case 3:
			System.out.println("View Balance");
		default:
			break;
		}
		scanner.close();
	}

}
