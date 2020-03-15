package Encapculation.ENCAPSULATION;

public class B extends Marks {
	int Math;
	int science;
	int Eng;
	int music;
	int score;
	
 B(int Math,int science,int Eng,int music)
	{
		this.Eng=Eng;
		this.Math=Math;
		this.science=science;
		this.music=music;
		this.score=score;
		 score=Eng+Math+science+music;
		System.out.println(score);
	}

@Override
void getPercentage() {
	double percentage=score/4;
	System.out.println(percentage);
	
}
	
}