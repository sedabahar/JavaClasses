package OPPsStatic;

public class Husky {
	
	static String breed="Husky"; //all object share this property
	static int paws=4;
	static int tale=1;
	
	
	String name;
	String color;
	
	void display() {
		System.out.println("Puppy name is "+name+" breed is "+breed);
	}

	public static void main(String[] args) {
		
		Husky puppy1=new Husky();
		Husky puppy2=new Husky();
		
		puppy1.name="Meatball";
		puppy1.color="Brown";
		
		puppy2.name="Sharik";
		puppy2.color="Black";
		puppy1.display();
		puppy2.display();
		
		System.out.println("changing breed");
		breed="Bulldog";
		puppy2.name="Charlie";
		puppy2.color="Green";
		
		puppy1.display();
		puppy2.display();
		
		
	}

}
