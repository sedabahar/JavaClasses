package OPPsStatic;

public class TASKJAVA {
	
	/*1.Create a Class called Employee:
	 * Create three  variables  eID , 
	 * salary and set the CEO to “Sumair” 
	 * Create two objects of the class Employee 
	 * Set the value of eID, salary for each of the objects
	 * Print out the eID , salary and  CEO for each of the objects 
	 */
	
	int salary;
	String eID;
	static String CEO="Sumair";
	

	public static void main(String[] args) {
		 TASKJAVA x=new  TASKJAVA();
		 x.salary=1000;
		 x.eID="209";
		 System.out.println(x.salary+"\n"+x.eID+"\n"+x.CEO);

	}

}
