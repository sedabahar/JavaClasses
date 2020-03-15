package Encapculation.ENCAPSULATION;

public interface MyInterface{
	  int a=100;
	  final int b=200;
	  static int c=300;
	 
	}
	class Main implements MyInterface{
	        Main(){
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		
	}