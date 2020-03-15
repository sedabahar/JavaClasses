package OOPsPRIVATE;

public class LocalVariable {
	
	public static void main(String[] args) {
		 LocalVariable obj=new  LocalVariable ();
		 obj.sayName();
		 //String x=obj.createEmail("seda", "demirkiran", "gmail");
         System.out.println(obj.createEmail("seda", "demirkiran", "gmail"));
	}
	
	
	void sayName() {
		String myName="John";
		System.out.println(myName);
	}
	
	
	String createEmail(String name,String lastname,String email) {
		String useremail=name+lastname+"@"+email+".com";
		
		return useremail;
	}
	
	

}
