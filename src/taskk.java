import java.util.Scanner;

public class taskk {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter quiz");
		double quiz=scan.nextDouble();
		System.out.println("Enter mid term");
		double mid=scan.nextDouble();
		System.out.println("Enter final");
		double fi=scan.nextDouble();
		
		
		double average=(quiz*0.3)+(mid*0.3)+(fi*0.4);
		
		if (average>=90) {
			System.out.println("grade A");
		}else if ((average>=70) && (average<90)) {
			System.out.println("grade B");
	
		}else if ((average>=50) && (average<70)) {
			System.out.println("grade C");
		}else if ((average<50)) {
			System.out.println("grade F");
		}else {
			System.out.println("WRONG");
		}
		
		//2
		 boolean iRain=true;
	     boolean classMode=true;
	       
	     if(!(iRain)) {
	    	 
	     if((classMode)) {
	    	 System.out.println("In Class");
	    	
	     }else {
	    	 System.out.println("Out Class");
	     }
	    	
	    	 	 
	     }
	     else {
	    	 System.out.println("Online");
	     }
		
		
		
		
		
		
		
		
		
		

	}

}
