package java_14th_may;

public class Padietrician extends Doctor {

	public Padietrician(String name, String specialization, int noOfYearsExperience) {
		super(name, specialization, noOfYearsExperience);
	}
	
	@Override
	public void treatPatient() {
		System.out.println("Treating kids...");
		treatKids();
	}

	public void treatKids() {
		System.out.println("Treat kids..");
	}
}
