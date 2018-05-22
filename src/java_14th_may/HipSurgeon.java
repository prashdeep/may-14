package java_14th_may;


public class HipSurgeon extends Orthopedecian{

	public HipSurgeon(String name, String specialization, int noOfYearsExperience) {
		super(name, specialization, noOfYearsExperience);
	}
	
	@Override
	public void treatPatient() {
		conductXRay();
		conductCTScan();
		conductHipOperation();
	}
	public void conductHipOperation() {
		System.out.println("Conducting Hip operation");
	}
}

