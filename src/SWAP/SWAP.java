package SWAP;

public class SWAP {

	public static void main(String[] args) {

	      String x="hello";
	      String y="word";
	      
	      x=x+y;
	      y=x.substring(0,(x.length()-y.length()));
	      x=x.substring(y.length());
	      System.out.println(x+" "+y);
	      System.out.println("**********************************");
	      
	      int i=10;
	      int z=15;
	      
	      i=i+z;
	      z=i-z;
	      i=i-z;
	      
	      System.out.println(i+" "+z);
	        
	        

	}

}
