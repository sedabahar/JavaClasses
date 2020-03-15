package INHERITANCE;

import POLYMORPHISM.Box;
import POLYMORPHISM.Rectangle;
import POLYMORPHISM.square;

public class Area {
	
	
	
	public static void main(String[] args) {
		
		 Rectangle x=new  Rectangle(3,4);
		 System.out.println("Your squared number is: " + x.Rectangle1());
		 
		 square y=new square(10);
	     System.out.println( y.square1());
		
	     Box mybox1 = new Box(3.0, 2.0, 4.0);
	      mybox1.volume();
	        
	}
}
