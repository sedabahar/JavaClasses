package EXCEPTION;

public class RunTimeandCompileTime {

	public static void main(String[] args) throws InterruptedException {
	
		
		//RunTime Compile unchecked
		int[]array= {2,3};
		try {
		System.out.println(array[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("trying to accses element outside of boundy");
		}
		//Compile Time checked
		Thread.sleep(1000);
		System.out.println("end of the code");
		
		
		
	}

}
