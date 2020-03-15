package ARREYLER;

import java.util.Scanner;

public class Orneklerrrr {

	public static void main(String[] args) {
	int[] num=new int[4];	
    Scanner scan=new Scanner(System.in);
    for(int i=0; i<num.length; i++) {
    	System.out.print("Please enter "+ (i+1)+ ". numbers :");
    	num[i]=scan.nextInt();
    }for(int x: num) {
    	System.out.println(x);
 }
    System.out.println();
    int a=0;
    int b=0;
    int c=0;
    int sum=0;
   for(int i=0; i<num.length; i++) {
    	if(num[i]<100) {
        	a++;
        	System.out.println(num[i]);
    	}if(num[i]>100 && num[i]<200){
          	b++;
        	System.out.println(num[i]);
    	}if(num[i]>200 && num[i]%4==0) {
            c++;
            sum+=num[i];
            //System.out.println(sum);
    	}
    }
	      //System.out.println("100 den kucuk " + a + " tane sayi var " );
	      //System.out.println("100-200 arasi " + b + " kadar sayi var ");
	      System.out.println("200 den buyuk ve 4 e tam bolunen " + c + " kadar sayi var ");
		 System.out.println(sum);
		
		

	}

}
