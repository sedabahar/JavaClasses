package OOPsPRIVATE;

public class IntanceVariable {
	
	
	  String name="Samir";
	  
	   static int eyes;
	

	public static void main(String[] args) {
		
		String name="Burcu";//local veriable
		System.out.println(name);
		//if we want to call intanceVariable we need to create (((( object )))
		IntanceVariable x=new IntanceVariable ();
		
		System.out.println(x.name);
		
		IntanceVariable y=new IntanceVariable();
		System.out.println(y.name);
		
	}

}
