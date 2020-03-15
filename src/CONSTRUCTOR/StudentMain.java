package CONSTRUCTOR;

public class StudentMain {

	public static void main(String[] args) {
	
		Student x=new Student("Marry","Current",96);
		x.Information();
	    x.JavaClass();
	    System.out.println();
	    Student y=new Student("Jack","Leo",66);
        y.Information();
        y.JavaClass();
	}

}
