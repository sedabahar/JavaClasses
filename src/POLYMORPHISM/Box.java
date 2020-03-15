package POLYMORPHISM;

public class Box {
    double width;
    double height;
    double depth;
    

    public Box(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}



	public void volume() {
        System.out.print("volume is ");
        System.out.println(width * height * depth);
    }



   
}
