package com.edureka.interfaces;

public class PremiumAccomodationServiceImpl implements AccomodationService{

	@Override
	public void book3StarHotel() {
		System.out.println("I am a Premium Vendot");
		System.out.println("Booked 4 star hotel accomodation within 2 KMs range");
		
	}

	@Override
	public void accomodateACCommute() {
		System.out.println("I am Premium vendor");
		System.out.println("Provide AC commute with extra baggage facility");
		
	}

}
