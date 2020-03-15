package com.class4;

import java.util.Scanner;

public class ScannerTask {

	public static void main(String[] args) {
		
//		double amount;
//		
//		Scanner myScanner=new  Scanner(System.in);
//		System.out.println("How much money34
//		you need for amount");
//		amount=myScanner.nextDouble();
//		
//		if(amount<200.000) {
//			System.out.println("You would lend the money");
//		}else {
//			System.out.println("You would reject the money");
//		}
//		
//		
//		//2
//		Scanner mScanner=new  Scanner(System.in) ;
//			System.out.println("How old are you ?");
//			int age=mScanner.nextInt();
//			
//			if(age>=18) {
//				System.out.println("You will issue driver licens");
//			}else {
//				System.out.println("You will get a learners permit");
//			}
//	
		//3
			Scanner nScanner=new  Scanner(System.in) ;
			
			System.out.println("Please enter temperature");
			int	temperature=nScanner.nextInt();
			temperature = ((temperature - 32)*5)/9;
			System.out.println("What is your city");	
			String city=nScanner.next();
			
		
			
			System.out.println("The temperature in the " + city + " is " + temperature + " Celsius");	
				
			
		
		
		
		
		
		
		
		
		
		
		

	}

}
