package stringMethod;



public class cokguzel {

	public static void main(String[] args) {
		String name="I live in USA ";
		String name1="I go to work";
		String[] name2= {"I live in USAA "};
		for(String i:name2) {
		System.out.println(i.trim());
		}
		System.out.println(name.charAt(5));
		System.out.println(name.indexOf("U"));
		System.out.println("..................");
		System.out.println(name.concat(name1));
		System.out.println("..................");
		System.out.println(name.length());
		System.out.println(name1.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.contains(name1));
		System.err.println(name1.contains(name));
		System.err.println(name.equalsIgnoreCase(name1));
		
		
		//starsWith() --------->
		System.out.println(name.startsWith("I"));
		System.out.println(name1.startsWith("go",2));
		System.out.println(name.startsWith("go"));
		
		
		//endWith() ----------->
		System.out.println(name.endsWith("USA"));
		
		
		
		String str = "abracadabra alakazam";
	    String target1 = "dab";
	    String target2 = "ABRA";
	    
	  
	     System.out.println(str.indexOf(target1));
		
		
		String x="Berkebartuannecan";
		System.out.println(x.replaceAll("[^aA]",""));
		
		
		int value=20; 
		String s1=String.valueOf(value); 
		System.out.println(s1+17); 
		
		String s10="ABC";
		byte[] b=s10.getBytes(); 
		for(int i=0;i<b.length;i++){ 
		System.out.println(b[i]);
		}
		
		String c="hello";
		String s2="hello"; 
		String s3="hemlo"; 
		String s4="flag";
		System.out.println(c.compareTo(s2)); // 0 because both are equal
		System.out.println(c.compareTo(s3)); //-1 because "l" is only one time lower than "m" 
		System.out.println(c.compareTo(s4)); // 2 because "h" is 2 times greater than "f"
		System.out.println();
		
		String s11="hello";
		s11=s11.concat("how are you");
		System.out.println(s11);
		
		System.out.println();
		String s13=""; 
		String s21="hello"; 
		System.out.println(s13.isEmpty());      // true
		System.out.println(s21.isEmpty());      // false
		
		
		String s="Is it saturday? Is it raining? Do we have a Java Class today?";
	    
	    String[] array=s.split("[\\?]");
	    
	    System.out.println(array.length);
	  
		

	}

}
