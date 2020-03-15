package OOPsRETURN;

public class PalindromeNumber {
	
	static boolean palindrome(int num) {
		
     int tem,r,sum=0;
     tem=num;
     while(num>0) {
    	 r=num%10;
    	 sum=(sum*10)+r;
    	 num/=10;
     }if(tem==sum) {
    	 return true;
     }
		return false;
	}	
	
	public static void main(String[]args) {
	
		if(palindrome(232)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not");
		}
		
		
}}
