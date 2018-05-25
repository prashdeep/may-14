package com.edureka.interfaces;

public class FoodServiceImpl implements FoodService {

	@Override
	public void arrangeFood() {
		System.out.println("Arranging food with Vendor: FoodServiceImpl");
		
	}

	@Override
	public void servingFood() {
		System.out.println("Serving food with Vendor: FoodServiceImpl");
		
	}
	
	public double getQuotation(){
		System.out.println("Quotation from Vendor: FoodServiceImpl");
		return 45.00;
	}

}
