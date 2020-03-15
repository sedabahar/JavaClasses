package OOPsPRIVATE;

import java.util.Scanner;

public class Teacher extends Student {
      private int salary;
	public Teacher(String name, String lastName, int grade,int salary) {
		super(name, lastName, grade);
		this.salary=salary;
	}
	
	
	void teacherSally(int salary) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How is your teacher ? ");
		String word=scan.nextLine();
		if(word.equals("E")) {
			System.out.println("Your teacher will get "+salary);
		}else if(word.equals("B")) {
			System.out.println("Your teacher will not get "+salary);
		}
		
	}
	

}
