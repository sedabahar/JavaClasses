package EXCEPTION;

import java.util.Scanner;

public class THROWSS {
	
public static void mekanKontrol(int yas) {
		if(yas<18) {
			
			throw new ArithmeticException();
			
		}else {
			System.out.println("mekana hosgeldiniz ");
		}
	}
		

	public static void main(String[] args) {
		
	//Throw ile kendi exception umuzu firlata biliriz	
		Scanner scan=new Scanner(System.in);
	 System.out.println("Yasinizi giriniz :");
	 int age=scan.nextInt();
	 
	 try {
	   mekanKontrol(age);
	 }
	 catch(ArithmeticException e) {
		 System.out.println("18 yasindan kucukler mekana giremez");
	 }
		
	 
	 
	 
	 

	}

}
