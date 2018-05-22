package java_14th_may;

public class Dentist extends Doctor{

	public Dentist(String name, String specialization, int noOfYearsExperience) {
		super(name, specialization, noOfYearsExperience);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void treatPatient() {
		System.out.println("I am a dentist");
	}

}
