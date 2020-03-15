package OOPsRETURN;

import OOPGiris.Car;

public class Task {
	
	String Email(String user,String Lastname,String emailtype) {
		String x=(user+Lastname+emailtype);
		
		return x;
	}
	static boolean palindrome(int num) {
		
	     int tem,r,sum=0;
	     tem=num;
	     while(num>0) {
	    	 r=num%10;
	    	 sum=(sum*10)+r;
	    	 num/=10;
	     }if(tem==sum) {
	    	 return true;
	     }
			return false;
		}	
		
		
	String grade (int getgrade) {
		String a1=null;
		if( getgrade>90) {
			a1="A";
		}else if( getgrade>80) {
			 a1="B";
		}else if( getgrade>70) {
			 a1="C";
		}else if( getgrade>50) {
		  a1="D";
		}else {
			 a1="F";
		}return a1;
	}
			
	public static void main(String[] args) {
		
		Task a=new Task();
		String d=a.Email("seda", "demirkiran", "@gmail.com");
		System.out.println(d);
		
		if(palindrome(232)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not");
		}
		
		
	Task b=new Task();
	 String z=b.grade(68);
	 System.out.println(z);
	 
	 
	 
	 
}}