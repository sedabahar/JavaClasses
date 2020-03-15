package com.class3;

public class TaskIf {

	public static void main(String[] args) {
		
		boolean isRain=true;
		if(isRain) {// isRain==true
			System.out.println("I wiil take umbrella");
			
			}else {
				System.out.println("I go for a walk");
			}
		
		
		boolean var=true;
        
        if(var) {
       	 System.out.println("Hello");
       		 
        }else {
       	 System.out.println("Bye");
        }
        
        
      
		//1
		double a=300;
		double b=200;
		
		if(a>b) {
			
		System.out.println("Double value "+ a + " is larger than "+b );	
	
		}else {
			System.out.println("Double value "+ b + " is larger than " + a);
			
		}
		//2
		
		
		int temp1=-38;
		
         if(temp1<32) {
        	 System.out.println("Water will freeze with temperature " + temp1 );
         }else {
        	 System.out.println("Water will NOT freeze with temperature " + temp1 );
        	 
        
        	 
         }
         
         
         
         
	}

}
