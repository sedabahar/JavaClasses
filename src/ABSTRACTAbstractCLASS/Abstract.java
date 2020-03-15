package ABSTRACTAbstractCLASS;

public abstract class Abstract {
	
	//process of separating ideas from their action
	//process of hiding implementation details and showing functionality to the user
	
	// 2 type classes  --->    1.ABSTRACT   2.CONCRETE
	
	// how to achieve Abstraction
	// 1.Abstract
	// 2.Interface
	
	// Abstract     --------> partial  (parsil,kismi)   abstraction
	// Interface    --------> full  abstraction
	
	
	abstract void speed(); //abstract method
public static void main(String[]args) {
		
		Abstract x=new bike();//Indirect obj creation
		x.speed();
	}}
 class bike extends  Abstract {

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Speed limit is 40 km");
	}

	}
	











