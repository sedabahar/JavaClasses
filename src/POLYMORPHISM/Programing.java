package POLYMORPHISM;


public class Programing {
	String y;
	
	public Programing(String y) {
		super();
		this.y = y;
	}
	void in(String x) {
		if(x.equals(y)) {
			System.out.println("programing "+x);
		}else {
			System.out.println("I love programing languages");
		}
	}
	
	
	
	public static void main(String[]args) {
		Programing a=new Programing(null);
		a.in("Java");
		
	}
	

}
