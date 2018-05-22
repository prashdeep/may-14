package java_14th_may;

public class KneeSurgeon extends Orthopedecian {

	public KneeSurgeon(String name, String specialization, int noOfYearsExperience) {
		//System.out.println("dfdsfdsf"); super should be the first call inside the constructor.
		super(name, specialization, noOfYearsExperience);
	}
	
	@Override
	public void treatPatient() {
		System.out.println("Treating knee patients");
	}
	
	public void conductKneeOperation() {
		System.out.println("Conducting Knee operation");
	}
}
