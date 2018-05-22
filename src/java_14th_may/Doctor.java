package java_14th_may;

public abstract class Doctor {
	private String name;
	private String specialization;
	private int noOfYearsExperience;
	
	public Doctor(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getNoOfYearsExperience() {
		return noOfYearsExperience;
	}
	public void setNoOfYearsExperience(int noOfYearsExperience) {
		this.noOfYearsExperience = noOfYearsExperience;
	}
	public Doctor(String name, String specialization, int noOfYearsExperience) {
		this.name = name;
		this.specialization = specialization;
		this.noOfYearsExperience = noOfYearsExperience;
	}
	public abstract void treatPatient();
	
	public final double consultationFeePerVisit() {
		return 200;
	}
}
