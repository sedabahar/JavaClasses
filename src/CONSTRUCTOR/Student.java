package CONSTRUCTOR;

public class Student {
	
	private String name;
	private String lastName;
	private int grade;
	static String school;
	
	public Student(String name, String lastNmae, int grade) {
		;
		this.name = name;
		this.lastName = lastNmae;
		this.grade = grade;
		this.school="Syntax";
	}
	
	void JavaClass() {
		if(grade>=90) {
			System.out.println("Cong!!!!!!!You can get a job :))");
		}else if(grade<=89 && grade>60) {
			System.out.println("Study hard to get a job ");
		}else {
			System.out.println("Impossible to get an job");
		}
	}
	void Information() {
		System.out.println(name+" "+lastName+" "+grade+" and school name is "+school);
	}
	
	
	
	
	
	
	
	
	
	

}
