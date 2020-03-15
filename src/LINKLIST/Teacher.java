package LINKLIST;

public class Teacher {
	String mathTeac,sciT;
	
	public Teacher(String mathTeac,String sciT) {
		this.sciT=sciT;
		this.mathTeac=mathTeac;
	}

	public void bestT() {
		System.out.println("Best teacher "+mathTeac);
	}
}
