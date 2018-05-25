package com.edureka.interfaces;

public class AccomodationServiceImpl implements AccomodationService {

	@Override
	public void book3StarHotel() {
		System.out.println("I am vendor 1");
		System.out.println("Booked 3 star hotel accomodation within 3 KMs range");
		
	}

	@Override
	public void accomodateACCommute() {
		System.out.println("I am vendor 1");
		System.out.println("Provide AC commute");
		
	}

}
