package CONSTRUCTOR;

public class constructor {
	
	void constructor(){
		//System.out.println("Hello");
	}
	private constructor(int a){
		System.out.println("I am constructor");
	}
	
	
	public static void main(String[]args) {
		constructor x=new constructor(3) ;
		x.constructor();
			
		
	}
	
	
	
	
	
	

}
