package stringMethod;

import java.util.Scanner;





public class Method {

	public static void main(String[] args) {
		String a="Geliyorum";
		String b="Git";
	                                                   String n="1234";
	     System.out.println(a.equals(b));                                          String j=String.valueOf(n);
	                                                          System.out.println(n);
		/*System.out.println(a.toLowerCase());
		System.out.println(b.toUpperCase());
		System.out.println(b.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a.charAt(0));
		System.out.println(a.charAt(3));
		System.out.println(a.length());
		System.out.println(a.compareTo(b));
		
		/*Scanner scan=new Scanner(System.in);
		System.out.println("1.metin");
		String m=scan.nextLine();
		
		/*System.out.println("2.Metin");
		String m1=scan.nextLine();
		int as=m.compareToIgnoreCase(m1);
		if(as==0) {
			System.out.println("equal");
		}else {
			System.out.println("Not");
		}*/
		
		System.out.println(a.startsWith("Gel"));
		System.out.println(a.lastIndexOf("m"));
		
		 System.out.println("...........................");
		 
		 String str1="Welcome To Syntax Solutions" ;
		 
		 

		char[] v1=str1.toCharArray();
		    for(char str11:v1) {
				System.out.println(str11+" ");
		    }	
		 
	System.out.println("..................................");
		    
	   Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	  
	  char[] v=word.toCharArray();
	  for(char word1: v){
	    System.out.println(word1+" ");
	  }
	     
	   System.out.println("**********************************");  
	  
	  
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextLine();
		}
		//leave above alone!  write your code below
	   	System.out.println(arr[0].substring(0,3));
			System.out.println(arr[1].substring(0,3));
			System.out.println(arr[2].substring(0,3));
			System.out.println(arr[3].substring(0,3));
	    System.out.println(arr[4].substring(0,3));
	  
	  
	    Scanner inp1 = new Scanner(System.in);
	    System.out.print("In:");
	    String word1 = inp1.nextLine();
	    //write your code below
	  
	  char[] v11=word1.toCharArray();
	  for(char a1: v11){
	    System.out.println(a1+" ");
	  }
		
		System.out.println("*****************************************************");
		
		  System.out.print("In:");
		  String name=inp1.nextLine();
		  
		  char[] a1=name.toCharArray();
		     for(char x:a1) {
		    	 System.out.println(x+" ");
		     }
	    
	    
	    
		     
		     String str="";
				System.out.println("Is this method empty=\n"+ str.isEmpty());
				
				String str2="Hello";
				System.out.println("Is this method empty= "+ str2.isEmpty());
				
				if(!str.isEmpty()) {
					System.out.println("This is not empty");
				}else {
					System.err.println("This is empty String");
				}
				
				String sentence="Each day has a promise to brighten,\nBut first you must allow the sun to come your way";
				System.out.println(sentence);
				System.out.println();
				System.out.println(".................................................");
			/*This method appends one String to the end of another
			 * The method returns a String with the value of the 
			 * String passed in to the method appended to the end
			 * of the string used to invoke this method	
			 */
				String str3=" Hello";
				String str4=" World";
				String str5=" People";
				System.out.println(str4+" "+str3+" "+str5);
				System.out.println(str3.concat(str4).concat(str5));
				
				/*This method returns a copy of the string
				 * with leading 
				 */
				String str6=" I love you ";
				System.out.println(str6.trim());
				
				String str7="We might be done early today";
				System.out.println(str7.charAt(14));
				
				
				/* This method returns the index within this string of the
				 * first occurrence of the specified character or -1
				 * if the character does not occur
				 */
				
				String str8="We might mnot be done early";
				System.out.println(str8.indexOf('m'));
				System.out.println(str8.indexOf('m',12));
				
			//kaincidan sonra baslamali onu soyluo ama sayarken bastan sayiyo  <-----------------------
		    //  eger yoksa cvp -1 olur      
	    
	    
	    
	    

	}

}
