package com.edureka.javajee.exceptions;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		String arg1 = null;
		String arg2 = null;
		double intArg1 = 0;
		double intArg2 = 0;
		try {
			arg1 = args[0];
			arg2 = args[1];
			System.out.println("You have entered arg1: " + arg1 + " arg2: " + arg2);
			intArg1 = Double.parseDouble(arg1);
			intArg2 = Double.parseDouble(arg2);
		} catch (ArrayIndexOutOfBoundsException | NullPointerException ex) {
			System.out.println("Please enter two numbers");
			System.out.println("Invalid input. Null");
		} catch (NumberFormatException nfe) {
			System.out.println("Please pass number and not string");
		} catch (ArithmeticException ae) {
			System.out.println("Cannot divide a number by 0");
		} catch (RuntimeException ex1) {
			System.out.println("Please enter two numbers");
		}

		System.out.println("The result of division is " + (intArg1 / intArg2));

	}
}
