package EXCEPTION;

import java.rmi.AccessException;

public class TRYandCATCH {

	public static void main(String[] args) {
		
		try {
		int a=30/0;	
		}
		catch(ArithmeticException e){  //(Exception da yazilsa olur ust class
			System.out.println("Bir sayi sifira bolunemez");
			
		}
		
		
		try {
			int []array= {1,2,3,4,5};
			System.out.println(array[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {//(Exception//Runtime exception da yazilsa olur ust class
			System.out.println("Array in boyunu astiniz");
		}
		
		
		System.out.println("Hello :)");
		
		
		
		
		
		

	}

}
