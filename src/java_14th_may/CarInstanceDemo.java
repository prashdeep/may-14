package java_14th_may;

public class CarInstanceDemo {

	public static void main(String[] args) {
		//data type variablename = new datatype[10];
		
		Car car = new Car("Black", "2018", "Maruti");
		Car car2 = new Car("Blue", "2018", "BMW");
		Car car3 = new Car("RED", "2018", "AUDI");
		Car car4 = new Car("GREEN", "FIAT");
		ArrayDemo demo = new ArrayDemo();		
		car.accelerate();
		car.accelerate();
		car.accelerate();
		System.out.println(car.getSpeed());
		System.out.println(car3.getSpeed());
		
		
		System.out.println(car.getColor());
		System.out.println(car.getModel());
	}
}
