package OPPs;

public class Recap {
	
	void display(int num) {
		while(num<5) {
			System.out.println("hello");
			num++;
		}
	}void say(int num,String x,int times){
		while(num<times){
			System.out.println(x);
			num++;
		}
	}
	
	public static void main(String[] args) {
	 Recap x=new Recap();
     x.display(0);
     x.say(0, "Java",5);
    
	}

}
