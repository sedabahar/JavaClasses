package stringMethod;

import java.util.Scanner;



public class examples {

	public static void main(String[] args) {
		
		 String a="Syntax java program?Hello?";	
		 
	     String []x=a.split("\\?");
	     System.out.println(x.length);
		 
	     
	     String []x1=a.split(" ");
		 System.out.println(x1.length);	
	     
		  String str3="is it saturday?is it raining?do we have a Java class today";
	      String[] str4=str3.split("\\?");
	      System.out.println(str4.length);
		 
	      String v="I love you";
	      String []b=v.split(" ");
	      System.out.println(b.length);
		 
		 
			
		
		
		
		
		
		String Str = new String("Welcome to geeksforgeeks");
		System.out.println(Str.substring(11,16));
		
		String name3="Berke";
		String name2="Ber";
		System.out.println(name2.substring(0,2));
		System.out.println(name3.contains(name2));
		System.out.println(name3.charAt(3));
		System.out.println(name3.indexOf("B"));
		
		
		
//Create a 2D array that first row will contain 4 names and second row will contain grades.
//Then you program should print name of the students that
//has as an A and B grade
		
	 String[][] array=  {{"Smith","Jordan","Jackson","Obama"},
			            {"AA","BB","CC","DD"}   };
		
	
		System.out.print(array[0][0]+" "+array[1][0]+"\n"+
				           array[0][1]+" "+array[1][1]+"\n"+
				           array[0][2]+" "+array[1][2]+"\n"+
				           array[0][3]+" "+array[1][3]);
		
		
		System.out.println(".........................................");
		
		//Create an array of cars : american, german, korean, italian.
		//Then retrieve all values from that array
		
/*Create an array of countries: north america countries, 
 * south america countries, europe countries, asian countries, african countries.
 *  Then print all values from that array.*/
 
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		  Scanner inp = new Scanner(System.in);
		  /* System.out.print("In:");
		   String word = inp.nextLine();
		   //write your code below
		   for(int i=0;i<=word.length()-1;i++){
		          System.out.print(word.charAt(i++));
		        }*/
		
		System.out.println("In: ");
		String in=inp.nextLine();
		
		for(int i=0;i<in.length()-1;i++) {
			System.out.print(in.charAt(i++));
		}
		
		
	
	}

}
