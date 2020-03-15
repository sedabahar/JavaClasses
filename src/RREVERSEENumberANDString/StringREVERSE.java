package RREVERSEENumberANDString;

public class StringREVERSE {
	
	
	public static void main(String[] args) {
	
		
		String a="SEDA";
		
		for(int i=a.length()-1;i>=0;i--) {
			System.out.println(a.charAt(i));
		}
		
		
		int num=12345;
		int reverse=0;
		for(;num!=0;num/=10) {
			int digit=num%10;
			reverse=reverse*10+digit;
		}System.out.println(reverse);
		
		
		
		
		

	}

}
