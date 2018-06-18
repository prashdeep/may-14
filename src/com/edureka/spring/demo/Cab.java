package com.edureka.spring.demo;

public class Cab  implements CabService{

	private String carNumber;
	private String owner;
	
	public void commute(String startLocation, String endLocation) {
		System.out.println("Commuting from A to B");
	}
}
