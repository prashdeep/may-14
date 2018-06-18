package com.edureka.dp;

public class CarFactory {
	
	private static CarFactory carFactory = new CarFactory();
	private CarFactory() {
		
	}
	public static CarFactory getInstance() {
		return carFactory;
	}
	
	public static Car createCar() {
		Car car = carFactory.new Car();
		return car;
	}
	
	
	public class Car {
		
		public Car(){
			
		}
		
	}
	

}


