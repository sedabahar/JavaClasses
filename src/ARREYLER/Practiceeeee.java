package ARREYLER;

import java.util.Arrays;
import java.util.Scanner;

public class Practiceeeee {

	public static void main(String[] args) {
	
	for(int a=0; a<10; a++) {
		for (int i=0; i<10; i++) {
			System.out.print("-"+" ");
			
		}
	System.out.println();
	}
	   
		System.out.println("********************************************");
//		Write a Java program to sum values of an array.
	
	int[] numbers= {1,2,3,4,5,6,7};
	int sum=0;
	for(int i=0; i<numbers.length; i++) {
		sum+=numbers[i];
	}
	System.out.println(sum);
	System.out.println();
//	 Write a Java program to separate even and odd numbers of an given array of integers.
//	 Put all even numbers first, and then odd numbers. 

	int[] num= {3,4,5,6,7,8};
	
	for (int i=0; i<num.length; i++) {
		
		if(num[i]%2==0) {
			System.out.println("even "+ num[i]);
		}else {
			System.out.println("odd "+ num[i] +" ");
		}
	}
	
//	Write a Java program to arrange the elements of an given array of integers where all positive
//	integers appear before
//	all the negative integers.
	
	
	int[] num1= {-2,-3,-8,0,1,2,4};
	
	for(int i=0;i<num1.length; i++) {
		if(num1[i]>=0) {
			System.out.println("pozitif = "+ num1[i]);
		}else {
			System.out.println("negatif = "+ num1[i]);
		}
	}
	
	
	
	
	
	
	
	}		
}	
		
		
		
		
		
		
		
	


