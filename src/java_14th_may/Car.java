package java_14th_may;

public class Car {

	private String color;
	private String model;
	private String make;
	private double speed;
	private String chassiNumber;
	private static int count;

	
	public Car(String color, String model, String make) {
		this.color = color;
		this.model = model;
		this.make = make;
		this.count++;
	}
	
	public Car(String color, String make) {
		this.color = color;
		this.make = make;
		this.count++;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void accelerate() {
		speed++;
	}

	public void slowDown() {
		speed--;
	}

	public void halt() {
		speed = 0;
	}

	public void changeColor(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return this.speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getChassiNumber() {
		return chassiNumber;
	}

	public void setChassiNumber(String chassiNumber) {
		this.chassiNumber = chassiNumber;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public static int getCarCount() {
		return count;
		
	}
}
