package com.edureka.interfaces;

public class PopularEventOrganizer implements AccomodationService, FoodService {

	@Override
	public void arrangeFood() {
		System.out.println("Arranging food with Vendor: PopularEventOrganizer");
		
	}

	@Override
	public void servingFood() {
		System.out.println("Serving food with Vendor: PopularEventOrganizer");
		
	}
	
	public double getQuotation(){
		System.out.println("Quotation from Vendor: PopularEventOrganizer");
		return 450.00;
	}

	@Override
	public void book3StarHotel() {
		System.out.println("Quotation from Vendor for booking 3 start accomodation: PopularEventOrganizer");
		
	}

	@Override
	public void accomodateACCommute() {
		System.out.println("Quotation from Vendor for AC commute: PopularEventOrganizer");
		
	}

}
