package PALINDROMEorNOT;

public class STRINGandINT {

	public static void main(String[] args) {
	
		int num=232;
		int tem,r,sum=0;
		tem=num;
		
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;		
			num/=10;
			
			
	    }if(tem==sum) {
		   System.out.println("polindrom");
	    }else {
		System.out.println("not");
	    }
		
		System.out.println("************************************************");
	
		
		String x="mon";
		String y="";
		for(int i=x.length()-1;i>=0;i--) {
			y=y+x.charAt(i);
		}if(y.equals(x)) {
			System.out.println("palindrome number");
		}else {
			System.out.println("not");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
