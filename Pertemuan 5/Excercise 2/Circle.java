package Exercise2;

public class Circle extends Shape { // Save as "Circle.java"
	private double radius; // private variable
	
	// Constructor with default color, filled and radius
	public Circle() {
		super(); // call superclass no-arg constructor Shape()
		radius = 1.0;
	}
	
	// Constructor with default color, filled but given radius
	public Circle(double radius) {
		super(); // call superclass no-arg constructor Shape()
		this.radius = radius;
	}
	
	// Constructor with color, filled, and radius parameter
	public Circle(double radius, String color, boolean filled) {
		super(color, filled); // call superclass with arg constructor Shape(color, filed)
		this.radius = radius;
	}

	/*return the radius*/
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/*return the radius*radius*Math.PI*/
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	/*return the 2*Math.PI*radius*/
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	public String toString() {
		return  "A Circle with radius="+radius + ", which is a subclass of " + super.toString();
	}
}
