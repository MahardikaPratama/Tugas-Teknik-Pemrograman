package Exercise2;

public class Square extends Rectangle { // Save as "Square.java"
	
	// Constructor with default color, filled, width, and length
	public Square() {
		super();
	}
	
	// Constructor with default color and filled, but given width and length
	public Square(double side) {
		super(side, side); // call superclass with arg constructor Rectangle(width, length)
	}
	// Constructor with  color, filled, width, and length parameter
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled); // call superclass with arg constructor Shape(width, length, color, filled)
	}
	
	/*return super.getLength()*/
	public double getSide() {
		return super.getLength();
	}
	
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	@Override
	public void setWidth(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	@Override
	public void setLength(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	@Override
	public String toString() {
		return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
	}
	
}
