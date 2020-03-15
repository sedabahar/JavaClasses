package ArrayListArrayyyyLISTTTTTTTT;

import java.util.ArrayList;

public class task3 {

	public static void main(String[] args) {
		
		
		ArrayList<String> drink=new ArrayList<String> ();
	   	drink.add("milk");
	 	drink.add("Fanta");
	   	drink.add("Juice");
	   	drink.add("Cola");
	  	drink.add("Cofee");
	  	

	   	        //Replace item while iterating
	   	        for(int i=0; i < drink.size(); i++) {
	   	            if(drink.get(i).contains("a")|| drink.get(i).contains("e") ) {
	   	            	drink.set(i, "water");
	   	             
	   	            }
	   	        } System.out.println(drink);
	   	         
	   	       
	   	    }
	   	
		
	}













