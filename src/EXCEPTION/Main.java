package EXCEPTION;

import java.util.Scanner;

public class Main {
	
	
	public static void mekanKontrol(int yas) {
		if(yas<18) {
			
			throw new InvalidAgeException("Invalid age");
			
		}else {
			System.out.println("mekana hosgeldiniz ");
		}
	}
		

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		 System.out.println("Yasinizi giriniz :");
		 int age=scan.nextInt();
		 
	try {
		   mekanKontrol(age);
	}catch(InvalidAgeException e) {
		e.printStackTrace();
	}
		 	
		 
	}

}
