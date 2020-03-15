package OPPs;
public class Parameters{
	
	

	//void sayHello(String name) {  //  ---->without Parameters
		//System.out.println("Hello Seda");
	
	
	
	
	void sayHello(String name) {  //  ---->with Parameters
		System.out.println("Hello "+name);
	}

	  void sayNameAndAge(String name,int age) {
		  System.out.println("My name is "+name+" and I am "+ age +" years old ");
		  System.out.println("My name is John and I am 25 years old");
	  }
	  
	  //create method that will check if it snowing
	  //if snow ---->stay at home, otherwise go for a walk
	  
	  void isSnow(boolean isSnow) {//...eger buraya yazarsak oraya gerek yok
		  //boolean isSnow=false;
		  if(isSnow) {
			  System.out.println("stay at home");//.....parantez icindeki parameter
		  }else {
			  System.out.println("go for a walk");
		  }
		  
	  }
	  
   public static void main(String[]args) {
	   
	 Parameters obj=new Parameters() ; 
	   
	  //obj.sayHello(); 
	   obj.sayHello("Asel");
	   obj.sayHello("Diago");
	   obj.sayNameAndAge("Seda", 34);
	   obj.isSnow(false);
   }
    
    
    
    
    
    
    
    
	
	

}
