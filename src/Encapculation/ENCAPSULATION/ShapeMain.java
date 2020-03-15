package Encapculation.ENCAPSULATION;

public class ShapeMain {

	public static void main(String[]args) {
		System.out.println("Shape Circle");
		Circle cir = new Circle();
		cir.r=5;
		cir.calculateArea();
		cir.calculatePerimiter();
		System.out.println("======================");
		System.out.println("Shape Square");
		Square sq = new Square();
		sq.length = 3;
		sq.calculateArea();
		sq.calculatePerimiter();
	
}}
