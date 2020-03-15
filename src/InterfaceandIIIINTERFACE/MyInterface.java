package InterfaceandIIIINTERFACE;

public interface MyInterface{
	   public void met1();
	   public void met2();
	 }


	class Main implements  MyInterface{
	  @Override
	  public void met1(){
	    System.out.println("implementation of method1");
	  }
	  @Override
	   public void met2(){
	    System.out.println("implementation of method2");
	  }
	  
	  
	}
	