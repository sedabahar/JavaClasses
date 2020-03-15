package SWAP;

abstract class Main{
	  abstract void met1();
	   abstract void met2(int a);
	   
	     public static void main(String[] args) {
	   Parent x=new Parent();
	  x.met1();
	  x.met2(5);
	  }
	
}
class Parent extends Main{

		@Override
		void met1() {
			System.out.println("abstract method1 implementation without argument in main class");			
		}

		@Override
		void met2(int a) {
			System.out.println("abstract method2 implementation with argument in main class");
			
		}

		
	  
	}
