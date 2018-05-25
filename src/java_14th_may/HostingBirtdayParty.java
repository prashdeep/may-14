package java_14th_may;

import com.edureka.interfaces.AccomodationService;
import com.edureka.interfaces.FoodService;
import com.edureka.interfaces.FoodServiceImpl;
import com.edureka.interfaces.PremiumAccomodationServiceImpl;

public class HostingBirtdayParty {
	
	AccomodationService accomodationService;
	FoodService foodService;
	
	
	public static void main(String[] args) {
		AccomodationService accomodationService = new PremiumAccomodationServiceImpl();
		FoodService foodService = new FoodServiceImpl();
		accomodationService.book3StarHotel();
	}

}
