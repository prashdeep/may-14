package com.edureka.interfaces;

import java.util.Scanner;

public class OrganizeMyLavishBParty {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your budget");
		int budget = sc.nextInt();
		FoodService foodService = null;
		if (budget  < 200) {
			foodService = new FoodServiceImpl();
		} else if (budget > 400 && budget < 1000) {
			foodService = new PremiumFoodServiceVendor();
		} else {
			foodService = new PopularEventOrganizer();
		}
		
		double quotation = foodService.getQuotation();
		foodService.arrangeFood();
		sc.close();
	}

}
