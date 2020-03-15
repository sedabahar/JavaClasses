package InterfaceandIIIINTERFACE;

public interface Output{
	   public void disPlay(double a,double b);
	   
}   interface Functions extends Output{
	
     double add(double num1,double num2);
     double sub(double num1,double num2);
     double mul(double num1,double num2);
     double div(double num1,double num2);
}
  class bain implements Functions {
	
		@Override
		public void disPlay(double num1, double num2){
			System.out.println("Result is :::"+ (num1+num2));
			System.out.println("Result is :::"+( num1-num2));
			System.out.println("Result is :::"+ num1*num2);
			System.out.println("Result is :::"+ num1/num2);
		}

		@Override
		public
		 double add(double num1, double num2) {
			return num1+num2;
		}

		@Override
		public double sub(double num1, double num2) {
			return  num1-num2;
		}

		@Override
		public double mul(double num1, double num2) {
			return  num1*num2;
		}

		@Override
		public double div(double num1, double num2) {
			return  num1/num2;
		} 
	
}
	 
	 
	 
	 
	 