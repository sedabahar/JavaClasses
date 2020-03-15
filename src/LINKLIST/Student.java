package LINKLIST;

public class Student {
	
	String name;
	String lastName;
	
	Student(String name,String lastName){
		this.name=name;
		this.lastName=lastName;
	}

	public void inf() {
		System.out.println("Student name is "+name+" LastName is "+lastName);
	}
	
}
