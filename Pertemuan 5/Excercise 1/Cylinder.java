package Exercise1;
public class Cylinder extends Circle { // Save as "Cylinder.java"
	private double height; // private variable

	// Constructor with default color, radius and height
	public Cylinder() {
		super(); // call superclass no-arg constructor Circle()
		height = 1.0;
	}
	// Constructor with default radius, color but given height
	public Cylinder(double height) {
		super(); // call superclass no-arg constructor Circle()
		this.height = height;
	}
	
	// Constructor with default color but given height and radius
	public Cylinder(double radius, double height) {
		super(radius); // call superclass no-arg constructor Circle(r)
		this.height = height;
	}
	
	// Constructor with radius, height, and color parameter
	public Cylinder(double radius, double height, String color) {
		super(radius, color); // call superclass constructor Circle(radius, color)
		this.height = height;
	}

	// A public method for retrieving the height
	public double getHeight() {
		return height;
	}

	// A public method for computing the volume of cylinder
	// use superclass method getArea() to get the base area
	public double getVolume() {
		return super.getArea()*height; /*menggunakan super.getArea() untuk memanggil method getArea() 
										pada superclass Circle dari dalam subclass Cylinder.*/
	}

	
	//melakukan override terhadap method getArea() agar dapat menghitung luas permukaan tabung bukan hanya luas alasnya saja
	@Override
	public double getArea() {
		return (2*Math.PI*height)+(2*super.getArea());/*menggunakan super.getArea() untuk memanggil method getArea() 
														pada superclass Circle dari dalam subclass Cylinder.*/
	}
	
	@Override
	public String toString() {
		return "Cylinder: subclass of " + super.toString() //menampilkan informasi tentang objek Cylinder
			+ " height=" + height;
	}
}
