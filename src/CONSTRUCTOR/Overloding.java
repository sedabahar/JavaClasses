package CONSTRUCTOR;

public class Overloding {
	//different amount of parameters
	Overloding (){
		System.out.println("I am non argument constructor");
	}
	//having different type of  parameters
	Overloding (String str){
		System.out.println("I am argument with one String param");
	}
	Overloding (int num){
		System.out.println("I am argument with one int param");
	}
	
	// we can write (double num1,int num2)-------(int num1,double num2)-
	// 1 double for 1 int  ---- ((double sum))
	
	
	
	
	

}
