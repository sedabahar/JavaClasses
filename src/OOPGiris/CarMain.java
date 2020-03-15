package OOPGiris;

public class CarMain {

	public static void main(String[] args) {
	//to create an object Syntax is
	//ClassName variable=new ClassName();
	Car car1=new Car();
	car1.make="Tesla";
	car1.model="S3";
	car1.color="Black";
	car1.year=2020;
	car1.wheels=4;
	car1.windows=5;
    car1.speed=2000;
   
	
	
	
    Car car2=new Car();
	car2.make="BMW";
	car2.model="i8";
	car2.color="Purple";
	car2.year=2019;
	car2.wheels=4;
	car2.windows=5;
    car2.speed=2000;
    //Accessing behavior
    car2.drive();
    car2.start();//calling
    car2.accelerate();
    //print features of the car
    //I have black tesla
    System.out.println("I have "+car1.color+" "+car1.make);
    //I drive bmw 2019
    System.out.println("I drive "+ car2.make+" "+car2.year);
    
    
    
	}

}
