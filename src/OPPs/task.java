package OPPs;

public class task {
	
	//create a method that will say hello in different language based 
	//on the value that will be based when user calls a method
	
	void sayHello(String country) {
		
		
		switch (country) {
		
		case "USA":
			System.out.println("Hello");
		    break;
		case "Turkey":
			System.out.println("Merhaba");
		    break;
		case "Russia":
		    System.out.println("Privet");
		    break;
		    
		default:
			System.out.println("Unknown");
		
		}}
		
		public static void main(String[]args) {
			
			task x=new task();
			x.sayHello("USA");
			x.sayHello("Turkey");
			
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	


