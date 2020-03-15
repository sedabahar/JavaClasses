package Encapculation.ENCAPSULATION;

public class Car {
	
	 double carPrice;
	 String color;
	
	void salePrice(double carPrice) {
		System.out.println(carPrice);
	}}
	class Sedan extends Car{
		int length;
	void salePrice(){
		
		if(length>20) {
			carPrice*=0.2;
			System.out.println(carPrice);
		}else {
			carPrice-=carPrice*0.5;
			System.out.println(carPrice);
		}
}
	
	class Truck extends Car{
		double weight;
         void salePrice(double weight){
			if(weight>2000) {
				 carPrice-=carPrice*0.1;
				System.out.println( carPrice);
			}else {
				 carPrice-=carPrice*0.2;
				System.out.println(carPrice);
			}
		}
		
	}
	
	}
	

		/*4. Create a Class Car that would have the following fields:
		 *  carPrice and color and method calculateSalePrice() which should be returning a price of the car.
		Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its own implementation of
		 calculateSalePrice() method in which returned price calculated
		 as following: if weight>2000 then returned price car should include
		 10% discount, otherwise 20% discount.
		The Sedan class has field as length and also does it is own implementation of
		 calculateSalePrice():
		 if length of sedan is >20 feet then returned
		* car price should include 5% discount, otherwise 10% discount
		
			double carPrice;
			String carColor;
			public double calculateSalePrice(double carPrice)
			{
				this.carPrice=carPrice;
				return carPrice;
			}
			}
		class Sedan extends Car
		{
			double length;
			@Override
		public double calculateSalePrice(double carPrice) {
				// TODO Auto-generated method stub
				this.carPrice=carPrice;
			if(length>20)
			{
			carPrice=carPrice-(carPrice*0.05);
			}
			else
			{
				carPrice=carPrice-(carPrice*0.10);	
			}
			System.out.println(carPrice);
			return carPrice;
			}
		}
		class Truck extends Car
		{
			double weight;
			public double calculateSalePrice(double carPrice)	
			{
				this.weight=weight;
				if(weight>2000)
				{
					carPrice=carPrice-(carPrice*0.10);	
				}
				else
				{
					carPrice=carPrice-(carPrice*0.20);	
				}
				System.out.println(carPrice);
				return carPrice;
			}
		}*/

		



