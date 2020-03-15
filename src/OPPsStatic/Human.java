package OPPsStatic;



public class Human {

	//instance variable
		String name;
		String lastname;
	//static variable	
		static int eye=2;
		static int nose=1;
		static boolean brain=true;
		
		public static void main(String[]args) {
		
		Human human1=new Human();
		human1.name="John";
		human1.lastname="Smith";
		
		System.out.println(Human.brain);
		System.out.println(human1.brain);
		System.out.println(brain);
		
		Human human2=new Human();
		human2.name="Jimmy";
		human2.lastname="Miller";
		human2.lastname="Doe";
		
		
		
		

	}

}
