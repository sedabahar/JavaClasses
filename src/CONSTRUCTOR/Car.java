package CONSTRUCTOR;

public class Car {
	
	String make,model;
	
	Car(){
		System.out.println("I am a non argument constructor");
	}
	Car(String make,String model){
		this.make=make;
		this.model=model;
	}
	

}
class Tesla extends Car{
	boolean autopilo;
	
	Tesla(){
		super();
	System.out.println("I am a child non argument constructor");
	}
	

	 Tesla(String make, String model,boolean autopilo) {
		super(make, model);
	    this.autopilo=autopilo;
	}


	void displayInfo() {
		System.out.println("Car "+ make+" "+" has an autopilot "+autopilo);
	}
	
	
}



