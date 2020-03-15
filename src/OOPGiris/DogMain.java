package OOPGiris;

public class DogMain {

	public static void main(String[] args) {
		
	Dog dog=new Dog() ;
	
	dog.type="Wolf";
	dog.color="Brown";
	dog.age=2;
	dog.weight=10;
	
	Dog dog1=new Dog();
	
	dog1.type="Bulldog";
	dog1.color="Black";
	dog1.age=4;
	dog1.weight=12;
	
  dog.walking();
  dog.eating();
	
  Dog dog2=new Dog();
  dog2.type="Husky";
  dog2.color="White";
  dog2.age=6;
  dog2.weight=14;
  
  System.out.println("I have a "+ dog.type);
  
	
	
	
		
		
	
	}

}
