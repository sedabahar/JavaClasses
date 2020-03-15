package EXCEPTION;

public class InsideMethods {
	

	public static void ucuncu() {
		try {
			int a=12/0;
		}
	catch(ArithmeticException e){
		System.out.println("Bir sayi 0'a bolunemez");
	}

	}
	
	public static void ikinci() {
		ucuncu();
	}

	public static void birinci() {
		ikinci();
	}
	
	public static void main(String[] args) {
	
			birinci();	
		

	}

}
