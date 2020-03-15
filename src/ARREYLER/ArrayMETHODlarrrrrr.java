package ARREYLER;

import java.util.Arrays; //ARRAYS.SORT     // RANDOM random=new Random();
import java.util.Random;                   // num[i]=rnd.nextInt(21);

public class ArrayMETHODlarrrrrr {

	public static void main(String[] args) {
	
//		int[]num=new int[5];
//		Random rnd=new Random();
//		
//		for(int i=0; i<num.length; i++) {
//			num[i]=rnd.nextInt(21);
//		}
//		for(int a: num) {
//			System.out.println(a);
//		}
//		System.out.println();
//		Arrays.sort(num);
//		
//		for(int b:num) {
//			System.out.print(b+ " ");
//		}
//		
//	int[]num1=new int[4];
//	int[]num2=new int[4];
//	Random rnd=new Random();
//	
//	for(int i=0; i<num1.length;i++) {
//		num1[i]=rnd.nextInt();
//	}for(int a: num1) {
//		System.out.print(a + " ");
//	}System.out.println();
//	 for(int i=0; i<num2.length; i++) {
//		 num2[i]=rnd.nextInt();
//	 }for(int b: num2) {
//		 System.out.print(b + " ");
//	 }
//	
//	 Arrays.sort(num1);
//	 Arrays.sort(num2);
//	
//	 System.out.println("\n" + Arrays.equals(num2,num1));	
//	
//	
	int[]num1=new int[4] ;
	int [] num2=new int[4];
	Random rnd=new Random();
	
	for(int i=0; i<num1.length; i++) {
		num1[i]=rnd.nextInt(20);
	}for(int a: num1) {
		System.out.print(a + " ");
		System.out.println();
	}for(int i=0; i<num2.length; i++) {
		num2[i]=rnd.nextInt(20);

	}for(int b: num2) {
		System.out.print(b + " ");
		
	}
//	Arrays.sort(num1);
//	Arrays.sort(num2);
	
	
	
	num1=Arrays.copyOf(num2,3);
	
	
	
	

	}

}
