package ClassSTRing;

import java.util.Scanner;

public class STringTask {

	public static void main(String[] args) {
		//lets ask user to enter browser
		//based on input we say "Your selected browser is"____________
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter browser name :");
		String browser=scanner.nextLine();
		
		//no for switch
		
		switch(browser.toLowerCase()) {
		case "fairfax":
			System.out.println("Execution be performed on "+browser);
		    break;
		case "chrome":
			System.out.println("Execution be performed on "+browser);
			break;
		case "ie":
			System.out.println("Execution be performed on "+browser);
		    break;
		case "safari":
			System.out.println("Execution be performed on "+browser);
			break;
		default:
			System.out.println("Please enter valid browser");
			break;
			
		    
		    
		    
		    
		    
		    
		    
		    
		    
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		

	}

}
