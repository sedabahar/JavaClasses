package Encapculation.ENCAPSULATION;

public class A extends Marks
{
	double Math;
	double science;
	double Eng;
	double score;
 A(double Math,double science,double Eng){
		this.Eng=Eng;
		this.Math=Math;
		this.science=science;
		this.score=score;
		 score=Eng+Math+science;
		System.out.println(score);
		
		
 }@Override
		void getPercentage() {
			double percentage=(score)/3;
			System.out.println(percentage);
			
		}
	}