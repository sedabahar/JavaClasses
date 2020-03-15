package ABSTRACTAbstractCLASS;


public class Circle extends Shape2D{
	final double pi = 3.14;
	int radius;

	public Circle(int radius, String color) {
		super(color);
		this.radius = radius;
	}

	public double calculateArea() {
		return pi * radius * radius;
	}

	public double calculatePerimeter() {
		return 2 * pi * radius;
	}
	
	public double calculateDiameter() {
		return 2 * radius;
	}

}