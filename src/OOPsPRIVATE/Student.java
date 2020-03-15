package OOPsPRIVATE;

public class Student {
	
	private String name,lastName;
	private int grade;
	public Student(String name, String lastName, int grade) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		if(grade>90) {
			System.out.println(name+" "+" get an excellent grade your grade is :"+grade);
		}else if(grade<90 && grade>80) {
			System.out.println(name+" "+" get good grade your grade is : "+grade);
		}else if(grade<80 && grade>70) {
			System.out.println(name+" "+" you get "+grade+" study more ");
		}else if(grade<70 && grade>60) {
			System.out.println(name+" "+" you get "+grade+" bad grade study more ");
		}else {
			System.out.println("UNknown");
		}
		this.grade = grade;
	}
	
	
	
	
	
	
	

}
