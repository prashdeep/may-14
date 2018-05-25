package com.edureka.threads;

public class RunnableExample extends Employee implements Runnable {
	
	public static void main(String[] args) {
		RunnableExample thread1 = new RunnableExample();
		Thread t = new Thread(thread1);
		t.start();
		
		for ( int i = 0; i < 5; i ++) {
			System.out.println("Printing from the main thread !! "+i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i ++) {
			System.out.println("The value of i  from the"+Thread.currentThread().getName()+" is "+i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
	}
}

class Employee1 {
	
	private String name;
	public Employee1(String name ) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
