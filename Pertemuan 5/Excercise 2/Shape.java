package Exercise2;
/**
* The Shape class models a shape with a color and filled.
*/
public class Shape { // Save as "Shape.java"
	// private instance variable, not accessible from outside this class
	private String color;
	private boolean filled;
	
	// Constructors (overloaded)
	/** Constructs a Shape instance with default value for color and filled */
	public Shape(){ // 1st (default) constructor
		color = "red";
		filled = true;
	}
	
	/** Constructs a Shape instance with the given color and filled */
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	/** Returns color */
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	/** Returns filled */
	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		return "A Shape with color of "+color+ " and " + filled;
	}
}
