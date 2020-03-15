package com.class4;

public class NestedIfMore {

	public static void main(String[] args) {
		/*check age,if age less than 16-->you are too young to drive
		 * otherwise-->you are eligible to drive & we will check 
		 * if you are older than 18 --->you can get drive license if not you can gel driver permit
		 */

		int age=34;
		
		if(age<16) {
			
			System.out.println("You are too young to drive");
		}
		 else {
		    System.out.println("You are eligible to drive");	
		 }
			
         if(age>=18) {
			
			System.out.println("You can drive alone ");
		}
		 else {
		    System.out.println("You need your parent to drive");	
		
		 }
         
		// we need to check if student completed the quiz
		 // if yes-->good job,if not--->not good
	     // if they completed we will check store
	     //if more than 90-->you got an A
         //if more than 80-->you got an B
         //ANYTHING BELOW-->you should study more
         
         boolean quiz=true;
         int score=89;
         
         if(quiz) {
        	 System.out.println("Good job");
         
	         if(score>90) {
	    	 System.out.println("you got an A");
	         }else if (score>80) {
	    	 System.out.println("you got an B");
	         }else {
	    	 System.out.println("you should study more");
	         }
         
          }else {
        	 System.out.println("Not good");
          }
		
		
		
		
		
	}
	

}
