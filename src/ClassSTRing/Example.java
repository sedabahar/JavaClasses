package ClassSTRing;



public class Example {

	public static void main(String[] args) {

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
		
		
		
		
		
		
		
		
		
		
		

	}

}
