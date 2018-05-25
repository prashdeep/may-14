package com.edureka.interfaces;

public class PremiumFoodServiceVendor implements FoodService {
	@Override
	public void arrangeFood() {
		System.out.println("Arranging food with Vendor: PremiumFoodServiceVendor");
		
	}

	@Override
	public void servingFood() {
		System.out.println("Serving food with Vendor: PremiumFoodServiceVendor");
		
	}
	
	public double getQuotation(){
		System.out.println("Quotation from Vendor: PremiumFoodServiceVendor");
		return 450.00;
	}

}
