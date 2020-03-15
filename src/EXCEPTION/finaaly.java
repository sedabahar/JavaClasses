package EXCEPTION;

public class finaaly {

	public static void main(String[] args) {
		
		String str="Hello";
		
		try {
			char x=str.charAt(20);
			System.out.println(x);
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			
		}finally {
			System.out.println("I am finally block");
		}
		
		System.out.println("end of the code");
		
		
		
		
		
		
	}

}
