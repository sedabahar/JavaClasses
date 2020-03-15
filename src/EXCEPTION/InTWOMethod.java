package EXCEPTION;

public class InTWOMethod {

	public static void main(String[] args) {
		int num1=12;
		int num2=13;
		
		division(12,0);
		division(12,12);

	}

	public static void division(int num1,int num2) {
		int result;
	
		try {
			result=num1/num2;
			System.out.println(result);//new AritmeticException
			//Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println("Please do not pass second number as a 0");
		}//catch(InterruptedException e) {// new InterruptedException
			//System.out.println();
		//}

	}

}
