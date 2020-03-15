package OPPsStatic;

public class AccesingStaticVariable {

	public static void main(String[] args) {
		Husky x=new Husky();
		System.out.println(x.breed);
		
		//static is a keyword
		//static keyword can be used with variables
		
		Husky.breed="New breed";
		System.out.println(x.breed);
		
		
		
		
		
		
		
	}

}
