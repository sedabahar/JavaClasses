package ABSTRACTAbstractCLASS;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape2D shape1 = new Circle(3, "red");
		double d = shape1.calculateArea();
		System.out.println(d);

		d = shape1.calculatePerimeter();
		System.out.println(d);

		Shape2D shape2 = new Rectangle(2, 3, "blue");

		d = shape2.calculateArea();
		System.out.println(d);
		d = shape2.calculatePerimeter();
		System.out.println(d);

		System.out.println("---Shape array---");
		Shape2D[] shapes = new Shape2D[6];
		shapes[0] = shape1;
		shapes[1] = shape2;
		shapes[2] = new Rectangle(3, 4, "yellow");
		shapes[3] = new Circle(2, "brown");
		shapes[4] = new Rectangle(4, 2, "green");
		shapes[5] = new Square(3, "black");

		double totalArea = 0;
		for (Shape2D shape : shapes) {
			totalArea += shape.calculateArea();
		}
		System.out.println("Total area is " + totalArea);

		double totalPerimeter = 0;
		for (int i = 0; i < shapes.length; i++) {
			Shape2D shape = shapes[i];
			totalPerimeter += shape.calculatePerimeter();
		}
		System.out.println("Total perimeter is " + totalPerimeter);

	}

}