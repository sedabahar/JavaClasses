package INHERITANCE;

public class Student {
	String name,lastName;
	int grade;
	
	void calculateGrade() {
		
		if(grade>80) {
			System.out.println(name+" is doing great job");
		}else if(grade<80&& grade>60) {
			System.out.println(name+"try your best");
		}else {
			System.out.println("stady hard");
		}
	}
	
	public static void main(String[] args) {
		Student x=new SchoolStudents();
		x.grade=86;
		x.name="John";
        x.calculateGrade();
	}}



class SyntaxStudents extends Student{

	@Override
	void calculateGrade() {
	super.calculateGrade();
	}
	void getJob() {
		System.out.println("study hard get job");
	}
	
}
class CollegeStudents extends Student{

	@Override
	void calculateGrade() {
		super.calculateGrade();
	}
	
}	
class SchoolStudents extends Student{

	@Override
	void calculateGrade() {
		// TODO Auto-generated method stub
		super.calculateGrade();
	}
	
}
