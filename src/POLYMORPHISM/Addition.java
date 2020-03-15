package POLYMORPHISM;

public class Addition {
	
	public void add(int num1,int num2){
		
		System.out.println(num1+num2);
		
	}
	public void add(int num1,int num2,int num3) {
		
		System.out.println(num1+num2+num3);
	}
public void add(double num1,double num2) {
		
		System.out.println(num1+num2);
	}
public void add(int num1,double num2) {
	
	System.out.println(num1+num2);
}
	public static void main(String[]args) {
		
		Addition  ad=new  Addition();
		ad.add(3, 4);
		ad.add(7, 8, 9);
		ad.add(1.2, 2);
		ad.add(1.3, 6.7);
		
		String str="Hello";
		System.out.println(str.substring(3));
		System.out.println(str.substring(1,3));
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
