package com.edureka.threads;

public class PrintManager implements Runnable {
	
	Printer printer = new Printer();
	private static Employee employee;
	private static int pageCount;
	static PrintManager manager = new PrintManager();

	public static void managePrinter(Employee emp, int count) {
		employee = emp;
		pageCount = count;
		
		Thread t = new Thread(manager);
		t.start();
	}
	@Override
	public void run() {
		printer.print(employee,pageCount);
		
	}

}
