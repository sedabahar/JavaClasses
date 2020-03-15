package ClassSTRing;

public class StringClassRecapBugun {
	
	public static void main(String[]args) {
		
	String str="Syntax Technologies";
	
	System.out.println(str.charAt(5));	
	System.out.println(str.charAt(str.length()-1));	
		
	//get a substring from a String	
	
	System.out.println(str.substring(0,6));
	System.out.println(str.substring(7));	
	//	
	String s="Java classes at Syntax are awsomeI love you";
	System.out.println(s.replace("awsome", "great"));
	System.out.println(s.replace("GIT", "SDLC"));	
	//System.out.println(s.replace("a","1234%%77**&"));	
	//System.out.println(s.replaceAll("[^A-Za-z0-9]","" ));	
		
	//split	
		
	String[] array=s.split(" ");   
	System.out.println(array.length);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
	
	


}
