package java_14th_may;

import java.util.Scanner;

public class PolymorphishmDemo {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		String patientName = sc.next();
		System.out.println("Hi "+patientName+" : Please enter options as below: ");
		System.out.println("Option 1: OrthoPedician");
		System.out.println("2: Padietrician");
		System.out.println("3: Knee Surgeon");
		System.out.println("4: Hip Surgeon");
		System.out.println("5: Dentist");
		System.out.println("6: Gynacologies");

		int option = sc.nextInt();
		Doctor doctor = null;
		switch (option) {
		case 1:
			doctor = new Orthopedecian("Pradeep","Ortho", 12 );
			break;
		case 2:
			doctor = new Padietrician("Naveen","Padietrician", 22 );
			break;
		case 3:
			doctor = new KneeSurgeon("Habib","Knee Surgeon", 12 );
			break;
		case 4:
			doctor = new HipSurgeon("Vasu","Hip Surgeon", 15 );
			break;
		case 5:
			doctor = new Dentist("Vikram","Hip Surgeon", 15 );
			break;
		case 6:
			doctor = new Gynacologies("Vikram");
			break;
		default:
			System.out.println("You did not enter the correct option.");
			break;
		}
		
		doctor.treatPatient();
		
		double consultationFee = doctor.consultationFeePerVisit();
		System.out.println("Please pay Rs: "+consultationFee);
	}
}
