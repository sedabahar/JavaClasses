package Encapculation.ENCAPSULATION;

public abstract class Marks {
	double grade;String student;double per;
	
	abstract void getPercentage();
	
	public static void main(String[]args) {
		B b=new B(89,67,66,100);
		b.getPercentage();
		
	}
}





/*We have to calculate the percentage of marks
 *  obtained in three subjects (each out of 100) by student A
 *   and in four subjects (each out of 100) by student B.
 *   Create class ‘Marks’ with an abstract method ‘getPercentage’.
 *    It is inherited by classes ‘A’ and ‘B’ each having a method
 *    with the same name which returns the percentage of the students.
 *    The constructor of student A takes the marks in three subjects as
 *    its parameters and the marks in four subjects as its
 *   parameters for student B. Test your code
 *
 */
	

//abstract void getPercentage();
/*
public class A extends Marks
{
	double Mathsmarks;
	double sceincemarks;
	double EnglishMarks;
	double score;
 A(double Mathsmarks,double sceincemarks,double EnglishMarks)
	{
		this.EnglishMarks=EnglishMarks;
		this.Mathsmarks=Mathsmarks;
		this.sceincemarks=sceincemarks;
		this.score=score;
		 score=EnglishMarks+Mathsmarks+sceincemarks;
		System.out.println(score);
	}
	public void getPercentage()
	{
		double percentage=(score)/3;
		System.out.println(percentage);
	}*/



