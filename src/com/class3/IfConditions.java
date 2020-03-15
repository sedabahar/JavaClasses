package com.class3;

public class IfConditions {

	public static void main(String[] args) {
		
		int expectedHours=15;
		int actualHours=2;
		//if expected hours are more than actual-> you will succeed
		//otherwise, please study more
		
		if (expectedHours>actualHours) {
			
			System.out.println("you will succeed");
			
	
		}else {
			System.out.println("please study more");
		}
		
		double teaPrice=4.99;
		double allowPrice=3.99;
		teaPrice-=2;
		
		if(allowPrice>=teaPrice) {
			
		     System.out.println("I will buy");
		     System.out.println("And I will enjoy my tea");
			
			
		}else {
			System.out.println("I cannot effort, I need study more");
			System.out.println("I will go back to study more");
		}
			
		
		System.out.println("I keep writing some code");
		System.out.println("I keep writing more code");
		
		
		
	

	}

}
