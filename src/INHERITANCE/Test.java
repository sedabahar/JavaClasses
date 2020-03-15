package INHERITANCE;

public class Test {

	public static void main(String[] args) {
		Child1 x=new Child1();
        System.out.println(Child1.race);
        System.out.println(x.eyeColor);
        System.out.println(x.hairColor);
        x.code();
        x.sing();
        
        Parent y=new Parent ();
        System.out.println(y.eyeColor);
        System.out.println(y.hairColor);
        System.out.println(Parent.race);
        y.sing();
        
        Child2 z=new Child2();
        System.out.println(z.eyeColor);
        System.out.println(z.hairColor);
        System.out.println(Child2.race);
        z.speak();
        z.sing();
	}

}
