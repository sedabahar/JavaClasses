package com.class4;

public class NestedIf {
	
	public static void main(String[] args) {
		
		
		boolean isFriday=false;
		int day=13;
		// if today is Friday only day I want to check if it day is 13
		
		if(isFriday) {
			System.out.println("Today is friday");
			
		if(day==13) {
			System.out.println("I will watch scary movie");
		}	
		else {
			System.out.println("Today is Not friday");
		}
				
		}
		
	boolean b=true;
	boolean classToday=false;
	
	if (b) {
		
	System.out.println("Hello");
	
		if(classToday) {
			System.out.println("Hello my friend");
		}
		else {
			System.out.println("Bye");
		 }
		
		
	} else {  
	       System.out.println("I am continues code");
	}
		
	}
	

}
