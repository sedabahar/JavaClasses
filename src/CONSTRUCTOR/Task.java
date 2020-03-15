package CONSTRUCTOR;

public class Task {
	
	/*
Write program as a Student class   that has instance variables name and address.
 Create a constructor that will initialize those variables.
  Print name & address of given  student by the displayInfo method.

Write program as a Book class   that will have 2 Constructors.
 While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed*/

	String name,address;


	public Task(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
  void info() {
	System.out.println(name+" "+address);
  }
  
	public static void main(String[] args) {
		Task x=new Task("John","Luna");
		x.info();
		Task y=new Task("Berke","Demirkiran");
		y.info();
		
		

	}

}
