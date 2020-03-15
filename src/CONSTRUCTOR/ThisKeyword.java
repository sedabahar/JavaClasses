package CONSTRUCTOR;

public class ThisKeyword {
	int a,b;
	public  ThisKeyword(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public  ThisKeyword() {
		System.out.println("I am non argument constructor");
	}
	public void sum(int a,int b) {
		System.out.println("The sum of local parameters "+(a+b));
		System.out.println("The sum of instance parameters "+(this.a+this.b));
		
	}
	public void sayA() {
		System.out.print(a+" ");
	}
	public void sayB() {
		System.out.print(b+" ");
	}
	public void sayAandB() {
	this.sayA();
	sayB();// compiler adds this automaticlly --->this.sayB();
		
	}
	
	public static void main(String[]args) {
		ThisKeyword x=new ThisKeyword (8,7);
		x.sum(3, 5);
		x.sayA();
		System.out.println();
		x.sayB();
		System.out.println();
		x.sayAandB();
		System.out.println();
		ThisKeyword y=new ThisKeyword();
		y.sum(100,200);
		
	}

}
