package EXCEPTION;

public class UnchecedEXception {

	public static void main(String[] args) {
	//	e.printStackTrace(); give you detait where in the code exceptions occurs	
		
		
	System.out.println("Beginning of the code");
	
	int a=20;
	int b=0;
	try {
		System.out.println("I am code inside try block");
	System.out.println(a/b);
	System.out.println("I am continues code inside try block");
	}
	catch(ArithmeticException e) {
		System.out.println("I am code inside catch block");
		//e.printStackTrace();
		//System.out.println(e);
		System.out.println(e.getMessage());
	}
	
	
	System.out.println("End of the code");
	
	

	
	
	
	

}}
