package OPPsStatic;

public class TaskSTUDENT {

	/*Create a Class called Students
	 * Create three  variables  studentName , studentID  and  numberOfStudents
	 * Create three objects of the Students Class
	 * Set the value for  studentName , studentID and increment  the numberOfStudents 
	 * for each object
	 * Print out  total number of students
	 */
	
	String studentName;
	String studentID;
	
	static int numberOfStudents=1;
	
	public static void main(String[] args) {
		
		TaskSTUDENT x=new TaskSTUDENT ();
		x.studentName="John";
	    x.studentID="103";
	   
		System.out.println(x.studentName+" "+x.studentID+" "+"Total of students :"+x.numberOfStudents);
		System.out.println();
		TaskSTUDENT y=new TaskSTUDENT ();
		y.studentName="Marry";
	    y.studentID="104";
	    y.numberOfStudents+=1;
		System.out.println(y.studentName+" "+y.studentID+" "+"Total of students :"+y.numberOfStudents);
		System.out.println();
		TaskSTUDENT z=new TaskSTUDENT ();
		z.studentName="Michel";
	    z.studentID="105";
	    z.numberOfStudents+=1;
		System.out.println(z.studentName+" "+z.studentID+" "+"Total of students :"+z.numberOfStudents);
		System.out.println();
		
		
	}

}
