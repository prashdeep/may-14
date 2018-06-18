package com.edureka.spring.demo;

public class MyAwesomCab implements CabService{
	
	private String carNumber;
	private String owner;
	
	public void commute(String startLocation, String endLocation) {
		System.out.println("Commuting from A to B with class.. ");
	}

}
