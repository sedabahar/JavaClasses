package Encapculation.ENCAPSULATION;

class Ma implements FirstInterface,SecondInterface {

	@Override
	public void metod2() {
		  System.out.println("First Method implementing multiple Inheritance");
		
	}

	@Override
	public void metod1() {
		System.out.println("Second Method implementing multiple Inheritance");
		
	}
}
