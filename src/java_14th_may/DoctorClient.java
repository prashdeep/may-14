package java_14th_may;

public class DoctorClient {
	public static void main(String[] args) {
		//Doctor doctor = new Doctor("Kiran","Padietrician", 12); //can create doctor
	/*	Padietrician padietric = new Padietrician("Vikram", "Padietric", 10); 
		KneeSurgeon kneeSurgeon = new KneeSurgeon("Ramesh", "Knee-Replacement", 15);
		HipSurgeon hipSurgeon = new HipSurgeon("Ramesh", "Knee-Replacement", 15);
		
		padietric.treatKids();
		kneeSurgeon.conductKneeOperation();*/
		//doctor.treatPatient();
		
		// Tricky part
		Doctor doc1 = new Padietrician("Vikram", "Padietric", 10); 
		Doctor doc2 = new HipSurgeon("Vikram", "Ortho", 10); 
		//doc2.treatPatient();
		//Padietrician doc2 = new Doctor("Vikram", "Padietric", 10); 
		/*
		Doctor doc3 = new KneeSurgeon("Vikram", "Padietric", 10);
		//Padietrician doc4 = new Orthopedecian("Vikram", "Padietric", 10);
		 * 
	*/
		Doctor doc6 = new Padietrician("Pradeep", "Padietric", 22);
		
		//Padietrician padietric2 = doc6; 
		
		//to avoid classcastException 
		if(doc6 instanceof Padietrician) {
			System.out.println("Came inside the Padietrician block");
			Padietrician knownPadietric = (Padietrician) doc6;
			knownPadietric.treatPatient();
		
		}else if(doc6 instanceof Orthopedecian) {
			System.out.println("Came inside the Orthopedician block");
			Orthopedecian orthopedician = (Orthopedecian) doc6;
			orthopedician.treatPatient();
		}
		
		
		
		//Padietrician doc8 = new Padietrician("Pradeep", "Padietric", 22);
		
	}
}
