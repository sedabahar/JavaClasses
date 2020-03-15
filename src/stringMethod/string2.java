package stringMethod;



public class string2 {

	public static void main(String[] args) {
		 //There are two ways to create string objects
		//string Literal

		String name="John";
		System.out.println(name);
		//2.way 
		//Creating string with new key word
		String  name1=new String("John");
		
		
		System.out.println(name1.length());
		System.out.println(name1.trim());
		
        //This method returns the length of this string
		//the length is equal to the number
		//of 16-bit unicode characters in the string
		
		
		int name1len=name1.length();
		System.out.println("The length of name is= "+ name1len);
		
		String str1="Hello word";
		//toLowerCase
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		//EQUALS METHOD   ---------------> equalsIgnoreCase <-----------------((((  compare )))
		String str2="HEllo Word";
		
		                      System.out.println(str1.equalsIgnoreCase(str2));
		 //toUpperCase                     
		String str3="Mohammad";                      
		System.out.println(str3.toUpperCase());
		
		
	}

}
