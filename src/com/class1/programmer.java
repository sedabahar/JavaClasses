package com.class1;

public class programmer {

	public static void main(String[] args) {
		//This  is my second program
		
		int[][]num= {{4,4,6,4},
	             {3,6,9,4},
	             {0,-2,19,4},
	             {23,-29,8,4}};
int hum=0;
int hu1=0;

	for(int i=0;i<num.length; i++) {
		hum+=num[2][i];
		hu1+=num[3][i];
	}System.out.println(hum);
	 System.out.println(hu1);
	
	System.out.println("......................................");
	
	String ber="berke";
	System.out.println(ber.substring(0,3));	
	for(int a=0; a<ber.length();a++) {
		System.out.print(ber.charAt(a++));
	}
		
		
		
		
		
		System.out.println("I am a Java programmer");
		
	
			
		System.out.println("----------------------------------------");
		int[][]numArray= {{0,4,0,4},
	             {3,0,0,0},
	             {0,0,0,4}};
		int sumOfRow=0;
		for (int i = 0; i < numArray.length; i++) {
		    for (int j = 0; j < numArray[i].length; j++) {
		         sumOfRow += numArray[i][j];
		    }
		}System.out.println(sumOfRow);
		
		

	
	}
}
