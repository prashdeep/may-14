package com.edureka.dp;

public class SingletonDemo {
	
	public static void main(String[] args) {
		CarFactory obj1 = CarFactory.getInstance();
		CarFactory obj2 = CarFactory.getInstance();
		System.out.println(obj1 == obj2);
		
		CarFactory.Car car1 = CarFactory.createCar();
		CarFactory.Car car2 = CarFactory.createCar();
		System.out.println(car1 == car2);
	}

}
