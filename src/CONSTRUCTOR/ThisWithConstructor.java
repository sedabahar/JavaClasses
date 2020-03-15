package CONSTRUCTOR;

public class ThisWithConstructor {
	
	ThisWithConstructor(){
		System.out.println("I am non argument constructor");
	}
	ThisWithConstructor(String str){
		this();//use to call current class constructor
		//this(); this() always always MUST be a first statement
		//this(); in this case 
		System.out.println("I am constructor with 1 String parameter");
	}
	ThisWithConstructor(String str,String str1){
		this("Hello");
	    System.out.println("I am constructor with 2 String parameter");
	  
	}
	
	public static void main(String[]args) {
		ThisWithConstructor x=new ThisWithConstructor("Hello");
		System.out.println();
		//can we execute 2 constructors when creating an Object at the same time
		//yes = it can be achieved using ...this()...
		ThisWithConstructor y=new ThisWithConstructor("Hello","Bye");
		
		
	}
	
	

}
