package OOPGiris;

public class ComputerMain {

	public static void main(String[] args) {
		
		Computer com=new Computer();
        com.brand="Apple";
		com.name="MacBookPro";
		com.keyboard=true;
		com.screen=15;
		com.memory=250;
		
		com.JavaCoding();
		com.watchMovie();
		com.playGames();
System.out.println("My computer is "+com.name);
System.out.println("I have "+com.brand+" "+com.name);		
		
    	Computer com1=new Computer();
        
    	com1.brand="Dell";
    	com1.name="420";
    	com1.keyboard=true;
    	com1.memory=125;
    	
    	com1.JavaCoding();
    	com1.watchMovie();
    	com1.playGames();
    	
 System.out.println("I have "+com1.brand+" "+com1.name);   	
    	
    	
    	
    	
		
	}

}
