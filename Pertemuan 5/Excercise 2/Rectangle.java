package Exercise2;

public class Rectangle extends Shape { // Save as "Rectangle.java"
	private double width; // private variable
	private double length; // private variable
	
	// Constructor with default color, filled, width, and length
	public Rectangle() {
		super(); // call superclass no-arg constructor Shape()
		width = 1.0;
		length = 1.0;
	}
	// Constructor with default color and filled, but given width and length
	public Rectangle(double width, double length) {
		super(); // call superclass no-arg constructor Shape()
		this.width = width;
		this.length = length;
	}
	// Constructor with  color, filled, width, and length parameter
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled); // call superclass with arg constructor Shape(color, filled)
		this.width = width;
		this.length = length;
	}
	
	/*return width*/
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	/*return length*/
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	/*return length*width*/
	public double getArea() {
		return length * width;
	}
	/*return 2*(length+width)*/
	public double getPerimeter() {
		return 2*(length+width);
	}
	@Override
	public String toString() {
		return "A Rectangle with width=" +width+ " and length=" +length+", which is a subclass of " + super.toString();
	}
}
