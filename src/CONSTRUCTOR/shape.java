package CONSTRUCTOR;

public class shape {

	  double pi;
	  int r;
	  
	  shape ( double pi, int r){
		  this.pi=pi;
		  this.r=r;
	  }
	  
	 
	public static void main(String[] args) {
		circle  x=new circle (3.14,3);
        x.calculateArea();
	}

}
class circle extends shape{

	circle(double pi, int r) {
		super(pi, r);
		
	}
	
	void calculateArea() {
		 double area=(pi*r*r);
		  System.out.println(area);
	}
	
	
}