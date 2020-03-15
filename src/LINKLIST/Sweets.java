package LINKLIST;

import java.util.*;
import java.util.List;

class Sweets {
	String name;
	public Sweets(String name){
		this.name=name;
		
	}
	public void iLove() {
		System.out.println("I Love "+name);
		
	}
	
	public static void main(String[] args) {
		//create a list of sweets objects
		List<Sweets> sweetList=new LinkedList<>();
		
		sweetList.add(new Sweets("Chocolate"));
		sweetList.add(new Sweets("Cake"));
		sweetList.add(new Sweets("Cookies"));
		sweetList.add(new Sweets("Macaroons"));
		
		//lets display name of each sweet object
		for(Sweets element:sweetList) {
			System.out.println(element.name);
			element.iLove();
		}
		System.out.println("....................");
		Sweets mySweet=sweetList.get(2);
		mySweet.iLove();
		System.out.println("....................");
		
		sweetList.get(2).iLove();
		String nameOfTheSweet=sweetList.get(2).name;
		System.out.println(nameOfTheSweet);
		
		
		String str="Hello 123";
		str.replace("123", "456").trim();
		
		
		
		
		
		
		
		
		
		
		
	}

}
