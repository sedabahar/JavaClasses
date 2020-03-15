package OOPsRETURN;						

public class StringPalindrome {
	

	static boolean palandrome(String str) {
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		
		}if(reverse.contentEquals(str)) {
	return true;
	}
		return false;
		
	}
	
	
	public static void main (String[]args) {
		
		if(palandrome("mon")) {
			System.out.println("palindrome num");
		}else {
			System.out.println("not");
		}
		
		
	}
	
	
	
	
}
