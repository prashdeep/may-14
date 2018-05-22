package java_14th_may;

public class Orthopedecian extends Doctor {
	

	public Orthopedecian(String name ) {
		super(name);
	}

	public Orthopedecian(String name, String specialization, int noOfYearsExperience) {
		super(name, specialization, noOfYearsExperience);
	}

	
	public void conductXRay(){
		System.out.println("Conduct X-Ray");
	}
	
	
	public void treatPatient() {
		System.out.println("Treating people with bone ailments");
		conductXRay();
		conductCTScan();
		prescribeMedicine();
		
	}
	
	private void prescribeMedicine() {
		// TODO Auto-generated method stub
		System.out.println("prescibe medicine");
		
	}

	public void conductCTScan() {
		System.out.println("Conduct CT-Scan");
	}

}
