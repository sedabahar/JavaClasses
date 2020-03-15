package stringMethod;

import java.util.Scanner;



public class ornekstring {

	public static void main(String[] args) {
		String name="Berke";
		System.out.println(name.concat(" Bartu").concat(" Demirkiran"));
		System.out.println(".............................................");
		System.out.println();
		
		
		String string, sub;
	      int i, c, length;
	      
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter a string to print it's all substrings");
	      string  = in.nextLine();
	     
	      length = string.length();  
	 
	      System.out.println("Substrings of \""+string+"\" are:");
	     
	      for (c = 0; c < length; c++)
	      {
	         for(i = 1; i <= length-c ; i++)
	         {
	             sub = string.substring(c, c+i);
	            System.out.println(sub);
	         }
	      }
		
		System.out.println(".......................................");
		
		
		int [][]num= {{1,2,3,4,5},
				      {6,9,0,8,13},
				      {15,18,22,0,5}};
		int sum=0;
		int sum1=0;
		for(int m=0; m<num.length+2;m++) {
			//sum+=num[0][m];
			//sum+=num[1][m];
			sum+=num[2][m];
			
		}System.out.println(sum);
		
		
String a="Hello";
		
		for(int i1=a.length()-1;i1>=0; i1--) {
			System.out.println(a.charAt(i1));
		}
		System.out.println();
		
		System.out.println("*****************************************************");
		
		
		String b="Hellolokijrjjjjjjjjjjjj";
		
		if(!b.isEmpty()) {
			if(b.length()%2!=0 && b.length()>=3) {
				System.out.println(b.charAt(b.length()/2));
			}
			
		}
		
		System.out.println("*****************************************************");
		
		String x="Hello";
		if(!x.isEmpty()) {
			if(x.length()%2!=0 && x.length()>=3) {
				System.out.println(x.charAt(x.length()/2));
			}
		}
		String str="135H73KLD890SG4JKD745";
		
		System.out.println(str.replaceAll("[0-9]",""));
		System.out.println(str.replaceAll("[a-zA-Z]",""));
		
		
String c1="It is a Saturday?Is it Raining?Do we have a Java Class today?";
		
		String []array=c1.split("\\?");
		for (int i1=0; i1<array.length;i1++) {
			
		}System.out.println(array.length);
		
	
	String c11="It is a Saturday?Is it Raining?Do we have a Java Class today?";
	
	String []array1=c11.split("\\?");
	for (int i1=0; i1<array1.length;i1++) {
		
	}System.out.println(array1.length);
	
	
	
	
	
	String c111="I love berkosss aand Bartus";
	   
    System.out.println(c111.replace(" ",""));
	System.out.println(c111.contains("love"));	
		
		
	String a1="Berke";
	
	System.out.println(a1.length());
	System.out.println(a1.charAt(3));
	System.out.println(a1.charAt(a1.length()-1));
	
	System.out.println();
	String b1="Bartu";
	System.out.println(b1.charAt(b1.length()-2));
	
    String x1="Berke%$#@^`236";
	System.out.println(x1.replaceAll("\\W",""));
	
	String c1111="Elisa";
	System.out.println("kac harfli : "+c1111.length());
	System.out.println("kacinci harf gormek istersen :"+ c1111.charAt(2));
	System.out.println("ilk iki harf ise TRUE yoksa FALSE ----> "+ c1111.startsWith("El") );
	System.out.println("son iki harf ise TRUE yoksa FALSE ----> "+c1111.endsWith("se"));
	
	System.out.println("^ ^ ^ ^ ^ ^ ^^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^^ ");
	
	System.out.println(c1111.indexOf('s'));
	System.out.println(c1111.lastIndexOf('k'));
	
	String v="Ben Bugun Gidiyorum";
	System.out.println(v.toLowerCase());
	System.out.println(v.toUpperCase());
	
	String x11="Insallah Basaracagim Insallah";
	System.out.println(x11.toLowerCase());
    System.out.println(x11.charAt(6));
	System.out.println(x11.toCharArray());
	System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println();

	char[] v1=v.toCharArray();
	for(char p:v1) {
		System.out.print(p+" ");
	}
	System.out.println();
	System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
	Scanner scan = new Scanner(System.in);
	System.out.println("1.Metin :");
	String met=scan.nextLine();
	System.out.println("2.Metin :");
	String met1=scan.nextLine();
	int x111=met.compareToIgnoreCase(met1);
	if(x111==0) {
		System.out.println("Metinler esit");
	}else {
		System.out.println("Degil");
	}
	
	
	
	
	
	
	
	


	}

}
