package com.edureka.javajee.exceptions;

import java.io.IOException;

public class ExceptionDemo {
	public static void main(String[] args) {
		String arg1 = null;
		String arg2 = null;
		double intArg1 = 0;
		double intArg2 = 0;
		
		try {
			arg1 = args[0];
			arg2 = args[1];
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("please enter two numbers.");
		}
		if (arg1 == null || arg2 == null) {
			System.out.println("Either arg1 or arg2 or both are not passed..");
		} else {
			System.out.println("You have entered arg1: " + arg1 + " arg2: " + arg2);
			try {
				intArg1 = Double.parseDouble(arg1);
				intArg2 = Double.parseDouble(arg2);
			} catch (NumberFormatException e) {
				System.out.println("Please enter valid numbers");
				return;
			}
			
			System.out.println("The result of division is " + (intArg1 / intArg2));
		}
	}

}
