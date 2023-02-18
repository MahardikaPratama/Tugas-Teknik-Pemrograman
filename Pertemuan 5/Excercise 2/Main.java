package Exercise2;

import Exercise1.Cylinder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		System.out.println("Circle:"
				+ " radius=" + c1.getRadius()
				+ " color=" + c1.getColor()
				+ " base area=" + c1.getArea()
				+ " perimeter=" + c1.getPerimeter()
				+ "\n" + c1.toString()+ "\n");
		
		Circle c2 = new Circle(2.0);
		System.out.println("Circle:"
				+ " radius=" + c2.getRadius()
				+ " color=" + c2.getColor()
				+ " base area=" + c2.getArea()
				+ " perimeter=" + c2.getPerimeter()
				+ "\n" + c2.toString()+ "\n");
		
		Circle c3 = new Circle(2.0, "blue", false);
		System.out.println("Circle:"
				+ " radius=" + c3.getRadius()
				+ " color=" + c3.getColor()
				+ " base area=" + c3.getArea()
				+ " perimeter=" + c3.getPerimeter()
				+ "\n" + c3.toString()+ "\n");
		
		Rectangle r1 = new Rectangle();
		System.out.println("Rectangle:"
				+ " length=" + r1.getLength()
				+ " width=" + r1.getWidth()
				+ " color=" + r1.getColor()
				+ " base area=" + r1.getArea()
				+ " perimeter=" + r1.getPerimeter()
				+ "\n" + r1.toString()+ "\n");
		
		Rectangle r2 = new Rectangle(3.0, 4.0);
		System.out.println("Rectangle:"
				+ " length=" + r2.getLength()
				+ " width=" + r2.getWidth()
				+ " color=" + r2.getColor()
				+ " base area=" + r2.getArea()
				+ " perimeter=" + r2.getPerimeter()
				+ "\n" + r2.toString()+ "\n");
		
		Rectangle r3 = new Rectangle(3.0, 4.0, "yellow", true);
		System.out.println("Rectangle:"
				+ " length=" + r3.getLength()
				+ " width=" + r3.getWidth()
				+ " color=" + r3.getColor()
				+ " base area=" + r3.getArea()
				+ " perimeter=" + r3.getPerimeter()
				+ "\n" + r3.toString()+ "\n");
		
		Square s1 = new Square();
		System.out.println("Square:"
				+ " color=" + s1.getColor()
				+ " side=" + s1.getSide()
				+ " length=" + s1.getLength()
				+ " width=" + s1.getWidth()
				+ " base area=" + s1.getArea()
				+ " perimeter=" + s1.getPerimeter()
				+ "\n" + s1.toString()+ "\n");
		
		Square s2 = new Square(5.0);
		System.out.println("Square:"
				+ " color=" + s2.getColor()
				+ " side=" + s2.getSide()
				+ " length=" + s2.getLength()
				+ " width=" + s2.getWidth()
				+ " base area=" + s2.getArea()
				+ " perimeter=" + s2.getPerimeter()
				+ "\n" + s2.toString()+ "\n");
		
		Square s3 = new Square(5.0, "purple", false);
		System.out.println("Square:"
				+ " color=" + s3.getColor()
				+ " side=" + s3.getSide()
				+ " length=" + s3.getLength()
				+ " width=" + s3.getWidth()
				+ " base area=" + s3.getArea()
				+ " perimeter=" + s3.getPerimeter()
				+ "\n" + s3.toString()+ "\n");
		
	}

}
