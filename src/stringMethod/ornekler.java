package stringMethod;

import java.util.Arrays;


public class ornekler {

	public static void main(String[] args) {
		//-------> err -----> write else line red    out/err
				int a=2;
				
				if(a==20) {
					System.out.println("Number is "+a);
				}else {
					System.err.println("Number was not 20 but is  "+a);
				}
				
				//------->     contains 
				
				String sentence="It is raining";
				String sen="raining";
				System.out.println(sentence.contains(sen));
				System.err.println(sen.contains(sentence));
				
				  int[][] a1 = {

		                  {3, -1,  4,  0},
		                  {5,  9, -2,  6},
		                  {5,  3,  7, -8}

		             };
				
				  int sum=0;
				  int sum1=0;
				  int sum2=0;
				
				  for(int i=0;i<a1.length;i++) {
					  sum+=a1[0][i];
					  sum1+=a1[1][i];
					  sum2+=a1[2][i];
					  
				  }System.out.println("1.level :"+sum);
				   System.out.println("2.level :"+sum1);
				   System.out.println("3. level :"+sum2);
				
				System.out.println(".........................................");
				
			
			int an=1985;
			
			String en=String.valueOf(an);
			
			System.out.println(en);
			
		  System.out.println("******************************************************");
				
		  
		  
		  int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 
		  
		  Arrays.sort(arr); 

		  System.out.print(Arrays.toString(arr));
				
				System.out.println();
		  int[] arr1 = {130, 79, 68, 405, 201, 9, 101, 102}; 
				
		    Arrays.sort(arr1);
		  System.out.println(Arrays.toString(arr1));
				

			
		  
		  String s= "GeeksforGeeks"; 
	        // or String s= new String ("GeeksforGeeks"); 
	  
	        // Returns the number of characters in the String. 
	        System.out.println("String length = " + s.length()); 
	  
	        // Returns the character at ith index. 
	        System.out.println("Character at 3rd position = "
	                           + s.charAt(3)); 
	  
	        // Return the substring from the ith  index character 
	        // to end of string 
	        System.out.println("Substring " + s.substring(3)); 
	  
	        // Returns the substring from i to j-1 index. 
	        System.out.println("Substring  = " + s.substring(2,5)); 
	  
	        // Concatenates string2 to the end of string1. 
	        String s1 = "Geeks"; 
	        String s2 = "forGeeks"; 
	        System.out.println("Concatenated string  = " + 
	                            s1.concat(s2)); 
	        System.out.println();
	  System.out.println(".........................................................");
	        // Returns the index within the string 
	        // of the first occurrence of the specified string. 
	        String s4 = "Learn Share Learn"; 
	        System.out.println("Index of Share " +  
	                           s4.indexOf("Share")); 
	  
	        // Returns the index within the string of the 
	        // first occurrence of the specified string, 
	        // starting at the specified index. 
	        System.out.println("Index of a  = " +  
	                           s4.indexOf('a',3)); 
	  
	        // Checking equality of Strings 
	        Boolean out = "Geeks".equals("geeks"); 
	        System.out.println("Checking Equality  " + out); 
	        out = "Geeks".equals("Geeks"); 
	        System.out.println("Checking Equality  " + out); 
	  
	        out = "Geeks".equalsIgnoreCase("gEeks "); 
	        System.out.println("Checking Equality " + out); 
	  
	        int out1 = s1.compareTo(s2); 
	        System.out.println("If s1 = s2 " + out); 
	  
	        // Converting cases 
	        String word1 = "GeeKyMe"; 
	        System.out.println("Changing to lower Case " + 
	                            word1.toLowerCase()); 
	  
	        // Converting cases 
	        String word2 = "GeekyME"; 
	        System.out.println("Changing to UPPER Case " +  
	                            word1.toUpperCase()); 
	  
	        // Trimming the word 
	        String word4 = " Learn Share Learn "; 
	        System.out.println("Trim the word " + word4.trim()); 
	  
	        // Replacing characters 
	        String str1 = "feeksforfeeks"; 
	        System.out.println("Original String " + str1); 
	        String str2 = "feeksforfeeks".replace('f' ,'g') ; 
	        System.out.println("Replaced f with g -> " + str2);
		
		
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		
		String name=" hello how are you doing"; 
		System.out.println(name.contains("how are you"));  // returns true
		System.out.println(name.contains("hello"));        // returns true  
		System.out.println(name.contains("fine"));         // returns false  
		
		
				
				

	}

}
