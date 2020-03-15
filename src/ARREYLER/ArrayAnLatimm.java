package ARREYLER;

import java.util.Scanner;

public class ArrayAnLatimm {

	public static void main(String[] args) {
	
		
		Scanner scanner=new Scanner(System.in);
		
	     int[]numbers=new int[4];
	
	for(int i=0; i<numbers.length; i++) {
		System.out.println("please enter  " +(i+1)+ ". days");
		numbers[i]=scanner.nextInt();
		
	}
	
	for(int a: numbers) {
		System.out.print(a + " ");
	}
	//System.out.println(*********************************************************);
	
	Scanner scan=new Scanner(System.in);
	
    String[] days=new String[7];

   for(int i=0; i<days.length; i++) {
	System.out.println("please enter  " +(i+1)+ ". days");
	days[i]=scan.nextLine();
	
   }

   for(String b: days) {
	System.out.print(b + " ");
   }

	
	
	
	
	
	
	}

}


