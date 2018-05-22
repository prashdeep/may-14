package java_14th_may;
/**
 * This class will demonstrate the operators in Java language
 * @author pradep
 * @version 1.0
 * 
 * @since 1.8
 *
 */
public class OperatorDemo {

	public static void main(String args[]) {
		// this is a single line comment
		/*
		 * this is a multi line commnet
		 * dfdsdsfdsfdsf
		 * sdsdfsdf
		 */
		
		//to define a data type
		//datatype variable name  = value;
		int variable = 10;
		int var$sdfsd = 90;
		int $n3umeric10$_validVariable = 67;
		int $n3umeric10$_ValidVariable = 67;
		int i =10;
		int j = 34;
		int index = 56;
		int noOfEmployees = 2000;
		double distanceBetweenAandB = 567_435_435.34;
		long annualIncome = 45_34_545L;
		//Rules to be followed to define the variable names
		// it should not be a keyword (50 keywords)
		// it cannot contain special character apart from _ and $
		// Varaible names can contain alpha numeric characters [a-z][A-Z][0-9][$,_]
		// Variable name cannot start with number
		//Variable names cannot be duplicate
		
		//conventions used to create variable names
		// the variable names should start with small letters
		// The camel case should be used when working with more than one word
		//myNewVariable
		
		int a = 56;
		int b = 67;
		int sum = a + b;
		int result = a - b;
		int a1 = 40;
		int b1 = 6;
		System.out.println("Modulo operator output = "+a1 % b1);
		System.out.println("is a1 == b1 "+((a1 == b1)));
		++a1;
		System.out.println("The value after incrementing is "+a1);
		
		boolean flag1 = true;
		boolean flag2 = false;
		System.out.println("f1 && f2 " +(flag1 && flag2));
		System.out.println("f1 || f2 " +(flag1 || flag2));
		//System.out.println("The value of sum is "+sum);
		//System.out.println(result);
		
		//a++
		int v = 78;
		int x = 50;
		++x;
		v++;
		System.out.println(v);
		
		int salary = 5049;
		
		if (salary > 5000) {
			System.out.println("Watch a movie and dinner every weekend ");
			if (salary < 5050) {
				System.out.println("Greater but less than expected.");
			}
		} else if (salary < 5000){
			System.out.println("Go out for dinner every weekend");
		} else {
			System.out.println("Switch your job..");
		}
		
		//loop example
		for (int index1 =0 ; index1 < 10; index1 ++) {
			System.out.println("Index value is "+index1);
		}
	}
}
