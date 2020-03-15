package OPPs;

import java.util.Scanner;

public class Task1 {

	//parameters vs arguments
	//when we create  we specify parameters
	//when we call method we pass value==argument
	void large(int num1,int num2) {
		if(num1>num2) {
			System.out.println(num1+" is bigger number");
		}else {
			System.out.println(num2+" is bigger number");
		}
		
	}
	
	
	void even(int a) {
		if(a%2==0) {
			System.out.println(a+" even number");
		}else {
			System.out.println(a+" odd number");
		}
	}
	
	  void isPolindrome(String x) {
		  String y="";
	        
	        
			for (int i=x.length()-1;i>=0;i--) {
	           y=y+x.charAt(i);
	                
	        }
	        
	        if (x.equals(y) ) {
	            System.out.println(x+ " is a palindrome");
	        }else {
	            System.out.println(x+ " is not a palindrome");
	        }
	    
	    }
	    
	
	
		
	void palindrome(int num) {
		
		int tem,r,sum=0;
		tem=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num/=10;
		}if(tem==sum) {
			System.out.println("palindrome num");
		}else {
			System.out.println("not");
		}
		
	}
	
	
	public static void main(String[] args) {
	
		Task1 x=new Task1();
		x.large(34, 22);
		x.even(4);
		x.even(3);
		x.palindrome(232);
		x.isPolindrome("mom");
		
		
		
		

	}

}
