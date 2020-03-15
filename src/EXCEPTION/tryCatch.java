package EXCEPTION;

public class tryCatch {

	public static void main(String[] args) {
		try {
			int a=30/0;
			int []array= {1,2,3,4,5};
			System.out.println(array[6]);
			
			}
		
		
		catch(ArithmeticException e){  //(Exception da yazilsa olur ust class
			System.out.println("Bir sayi sifira bolunemez");
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {//(Exception//Runtime exception da yazilsa olur ust class
			System.out.println("Array in boyunu astiniz");
		}
		
		catch(Exception e) {
			System.out.println("ikisi icin exception kullanilmasi yeterli");
			
		}
		
		System.out.println("yaz");
		
		
		
		
		
		
		
		
	}
	
	

}
