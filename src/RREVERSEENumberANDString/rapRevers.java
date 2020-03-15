package RREVERSEENumberANDString;


public class rapRevers {

	
	
	    
	public static void main(String args[])  { 
	
		String x="mon";
		String y="";
		for(int i=x.length()-1;i>=0;i--) {
			y=y+x.charAt(i);
		}if(x.equals(y)) {
			System.out.println("prime");
		}else {
			System.out.println("not");
		}
		
		
		System.out.println("*********************************");

		
		
		int num=129;
		int tem,r,sum=0;
		tem=num;
	    while(num>0) {
	    	r=num%10;
	    	sum=sum*10+r;
	    	num/=10;
	    }if(tem==sum) {
	    	System.out.println("palin");
	    }else {
	    	System.out.println("not");
	    }
		
		
		
		
		
		
		
		
	       } 
	}
	
	
	
	
	
			
		
		

	
	
	
	

