package EXCEPTION;

public class THROWS {
	
	static String name="John";
	
	
	public static void studentSleeping() throws InterruptedException {
		System.out.println("Student "+name+" is sleeping");
		Thread.sleep(1000);
	}
	
	public static void callingSleepingStudent() throws InterruptedException {
		studentSleeping();
	}
	public static void callingmore() throws InterruptedException {
		studentSleeping();
	}

	public static void main(String[] args) {
		try {
			callingmore();
		} catch (InterruptedException e) {
			
			System.out.println("InterruptedException");
		}
		
	
		
		
		
		
		
		
		
		
		
	}

}
