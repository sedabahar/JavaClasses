package com.class1;

import java.util.Scanner;

public class Hello {

	public static void main (String[] args) {
		
    System.out.println("Hello World!" + "hello friend");
	
    int[][] num= {{1,2,3,4},
    		      {0,9,8,7},
    		      {4,5,6,7},
    		      {0,9,0,1}};
    /*int sum=0;
    for(int i=0; i<num.length; i++) {
    	sum+=num[0][i];
    }System.out.println(sum);*/
    int sum=0;
    for(int i=0; i<num.length;i++) {
    	for(int a=0;a<num[i].length;a++) {
    	 sum+=num[i][a];	
    	}
    }System.out.println(sum);
    
    String Name="SSEEDDAA";
    
    for(int i=0; i<Name.length();i++) {
    	System.out.print(Name.charAt(i++));
    }
    System.out.println();
    System.out.println(".............................................");
    
    Scanner inp = new Scanner(System.in);
    System.out.println("In:");
    String word = inp.nextLine();
    //write your code below
 
   for(int a=0; a<word.length()-1;a++) {
	   System.out.print(word.charAt(a++));
   }
    
    System.out.println("************************************************");
 
 
    for(int v=0; v<word.length()-1;v++) {
    	
    	System.out.println(word.charAt(v++));
    }
    
    
    
    
    
    
    
	
	}
}

