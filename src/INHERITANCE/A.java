package INHERITANCE;

public class A {

	static String name;
	String lastname;

	public A(String name, String lastname) {
		super();
		this.name = name;
		this.lastname = lastname;
	}
	
	public void info() {
		System.out.println(name+" "+lastname);
	}
	public void me() {
		System.out.println("I am A");
	}
	static String printF() {
		return "F";
		
		
	}
}
