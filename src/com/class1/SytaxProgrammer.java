package com.class1;

public class SytaxProgrammer {

	public static void main(String[] args) {

	      for ( char ch = 'a'; ch <= 'z'; ch++) {
	         System.out.print(ch+" ");
	   }
	   
		System.out.println("...............................");
		
		char c = 'a';
		 
		while (c <= 'z') {
		  System.out.println(c+" ");
		  c++;
		}
		
		System.out.print("for  *********************************");
		System.out.println();
		for(int v =0; v<=10; v++) {
			System.out.print(v+" ");
		}System.out.println();
		System.out.print("   while *********************************");
		System.out.println();
		int d=0;
		
		while(d<=10) {
		
			System.out.print(d+" ");
			d++;
		}System.out.print("Do  while *********************************");
		
		char p='a';
		
		do {
			
			System.out.print(p);
			p++;
			
			
			
		}while(p<='z');
		
		
		

		
	}

}
