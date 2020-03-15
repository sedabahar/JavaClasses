package EXCEPTION;

public class ThrowKeword2 {
	
	
	public static void main(String[] args) {
		try {
			checkAge(17);
			}
			catch(RuntimeException e) {
				System.out.println("You need to be 18 years old or more");
			}
		}
	
	
	public static void checkAge(int age) {
		if(age>=18) {
			System.out.println("you can get driver lisence");
		}else {
			throw new RuntimeException();
		}
	}
	

}
