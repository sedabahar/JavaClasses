package EXCEPTION;

import java.io.IOException;
import java.util.Scanner;

import javax.imageio.IIOException;

public class CHECKEDandUNCHECED {
	
	//THROWs key only for CHECKED exception

	public static void mekanKontrol (int yas) throws IOException{//check exception da muhakkak yaz
		if(yas<18) {
			
			throw new IOException();
			
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
		 catch(IOException e) {
			 System.out.println("IOException exception olustu....");
		 }
	 
	 
	 
	 
	 
}}
