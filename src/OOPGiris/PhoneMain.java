package OOPGiris;

public class PhoneMain {

	public static void main(String[] args) {
		
		
		Phone x=new Phone() ;
		
		x.brand="Apple";
		x.color="Gold";
		x.price=1000;
		
       Phone y=new Phone ();
		
		y.brand="Android";
		y.color="Rose";
		y.price=500;
		
		Phone z=new Phone();
		z.brand="Nokia";
		z.color="Blue";
		z.price=800;
		
		x.camera();
		x.waterproof();
		x.playGame();
		
		y.camera();
		y.waterproof();
		y.playGame();
		
		z.camera();
		z.waterproof();
		z.playGame();
		
		
	System.out.println("I have a "+ x.brand);	
		
		
		
		
		
	}

}
