package POLYMORPHISM;

class dog extends Animals{
    
	public dog(String name) {
		super(name);
	
	}

	
@Override
	
	public String speaking() {
		// TODO Auto-generated method stub
		return this.getName()+" is barking";
	}
	
	
}class cat extends Animals{

		public cat(String name) {
			super(name);
		
		}

		@Override
		public String speaking() {
		
			return this.getName()+" is mioving....";
		}
		
		
	}
	

public class Animals {
	private String name;

public Animals(String name) {
		super();
		this.name = name;
	}
public String speaking() {
	return "Animals are speaking....";
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;

}
public static void main(String[] args) {

	Animals x=new dog("Husky");
	System.out.println(x.speaking());
	Animals y=new cat("Boncuk");
	System.out.println(y.speaking());
	
}
	

}
