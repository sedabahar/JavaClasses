package OPPs;

import java.util.Scanner;
 class MethodInJAVA {
	 
	 

	public static void main(String[] args) {

	//methods:
  //built in- limited and we cannot modify 
		
	
	String str="Hello";
	str=str.replace("Hello", "Hi");
		
	System.out.println(str);
	
	Scanner scan=new Scanner(System.in);	
    String scannerString=scan.nextLine();
    System.out.println(scannerString);
    
    MethodInJAVA obj=new MethodInJAVA();
    obj.myMethod();
    
	}
	
	
	void myMethod() { // method header
		//method body
		System.out.println("This is user defined method that I created");
	}
	
	

	
	
	

}
