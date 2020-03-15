package POLYMORPHISM;

public class Task {
	
   public void sum(int num1, int num2, int num3) {
	   System.out.println(num1+num2+num3);
   }
   public void sum(String x) {
	   System.out.println(x);
   }
  public void sum(int num4, int num) {
	  System.out.println(num4+num);
   }
   
   

	public static void main(String[] args) {
		Task x=new Task();
		x.sum("Berke");
		x.sum(49, 8);
		x.sum(5, 6, 6);
		
		
		

	}

}
