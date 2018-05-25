package com.edureka.threads;

public class ThreadExtendingDemo extends Thread {
	
	public ThreadExtendingDemo(String name ) {
		super(name);
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadExtendingDemo demo = new ThreadExtendingDemo("Thread 1");
		//demo.setName("Thread 1");
		demo.start();
		ThreadExtendingDemo demo2 = new ThreadExtendingDemo("Thread 2 ");
		//demo2.setName("Thread 2");
		demo2.start();
		ThreadExtendingDemo demo3 = new ThreadExtendingDemo("Thread 3");
		//demo3.setName("Thread 3");
		demo3.start();
		
		for ( int i = 0; i < 5; i ++) {
			System.out.println("Printing from the main thread !! "+i);
			Thread.sleep(500);
		}
		Thread.currentThread().join(10000);
		
		System.out.println("main thread execution completed...");
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i ++) {
			System.out.println("The value of i  from the"+Thread.currentThread().getName()+" is "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
