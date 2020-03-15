package OPPsStatic;

public class TestStaticvsNonStatic {

	public static void main(String[] args) {
		
		StaticVsNonStatic x=new StaticVsNonStatic();
		System.out.println(x.school);
		
		StaticVsNonStatic.getInfo1();
		
		
		//to access nonStatic variable create OBJECT
		//with the Static you can use class name to call  like(StaticVsNonStatic.school)
		//to access static variable don't need to create OBJECT
		
		x.name="John";
		x.grade='A';
		x.getInfo();
		
	}

}
