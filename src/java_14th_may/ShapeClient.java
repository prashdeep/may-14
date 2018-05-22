package java_14th_may;

abstract class Shape {
	
	private int numberOfSides;
	private static final double PI = 3.142;
	
	public abstract double area();

}

class Rectangle extends Shape {

	private double length;
	private double breadth;
	
	 public Rectangle(double length, double breadth) {
		// TODO Auto-generated constructor stub
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double area() {
		return length * breadth;
	}
}

class Square extends Shape {
	private double length;


	@Override
	public double area() {
		return length * length;
	}
}

class Circle extends Shape{
	private double radius;


	@Override
	public double area() {
		return 3.142 * radius * radius;
	}
}

public class ShapeClient{
	
	public static void main(String[] args) {
		//Shape s = new Shape();
		Shape shape = new Rectangle(34,56);
		double rectangleArea = shape.area();
		System.out.println("Area of a rectangle is "+rectangleArea);
	}
	
}
