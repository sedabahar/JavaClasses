package EXCEPTION;

public class exception {

	public static void main(String[] args) {
		
		try {
			int []array= {1,2,3,4,5};
			System.out.println(array[6]);//hata hem ArithmeticException hem (ArrayIndexOutOfBoundsException
		
			int a=30/0;	
			
		}catch(Exception e) {
			System.out.println("ikisi icin exception kullanilmasi yeterli");
			e.printStackTrace();//hatanin ne oldugunu soyledi
		}
			
			
			
			
			
			
			
			
			
			
			

	}

}
