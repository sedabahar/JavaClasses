package ClassSTRing;

public class StringMethodBUGUN {

	public static void main(String[] args) {
	
		//String class 
		
		String str="Hello";
		//2 way creating a String 
		String str1=new String("hello");

		 System.out.println(str);
		 System.out.println(str1);
		
		 //case conversion methods/functions
		 
		str=str.toLowerCase();//hello
		System.out.println(str);
		 
		//verify if there if the string is Empty
		String myString="";//empty value
		boolean isEmpty=myString.isEmpty();
		System.out.println(isEmpty);
		
		//String x=null;//no value at all
		//System.out.println(x.isEmpty());
		
		//how to verify existence of characters in the String
		String a="Good evening students";
		System.out.println(a.contains("student"));
		System.out.println(a.startsWith("Good"));
		System.out.println(a.endsWith("student"));
		
		
		
		
		
		
		
		
		
		
		
		
		 
		

	}

}
