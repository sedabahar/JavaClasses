package EXCEPTION;

public class UncheckedException {

	public static void main(String[] args) {
		int a=30;
		int b=0;
		System.out.println(a/b);
		System.out.println("Code after an exception");
		System.out.println("continues code");
		
		int[]array= {10,20,30};
		System.out.println(array[3]);
		
		ArithmeticException exception=new ArithmeticException();
		throw(exception);

	}

}
