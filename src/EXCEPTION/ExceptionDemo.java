package EXCEPTION;

public class ExceptionDemo {
	
	public static void division2Integers(int num1,int num2) {
		
		try {
			System.out.println(num1/num2);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Connot divide by zero,please provide valid number");
			System.out.println(e.getMessage());
		}
		
	}

	public static void main(String[] args) {
	
		division2Integers(10,5);
		division2Integers(10,0);
		division2Integers(10,0);
		division2Integers(10,5);
		System.out.println("End of the code");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
