package com.edureka.threads;

public class Printer {
	
	public void print(Employee employee, int pageCount) {
		for (int i = 0; i < pageCount; i++) {
		    System.out.println("Printing for "+employee.getName()+ " page : "+i);
		    try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
