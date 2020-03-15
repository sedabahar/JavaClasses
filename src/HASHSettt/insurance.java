package HASHSettt;

public abstract class insurance {
	
    String insuranceName;

     abstract void getQuote();
	  abstract void cancelInsurance();
	  
	public class Car {
		  
		public String carModel;
       public String carColor,chairColor;
	
       	  
	 } class Pet {
		String petType,petColor;

		public Pet(String petType, String petColor) {
			super();
			this.petType = petType;
			this.petColor = petColor;
		}
		
       
	
	}
	class Health extends insurance{
        
		String cusName;
		
		
		public Health(String cusName) {
			super();
			this.cusName = cusName;
		}

		@Override
		void getQuote() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void cancelInsurance() {
			// TODO Auto-generated method stub
			
		}

		


}}
