package ArrayListArrayyyyLISTTTTTTTT;

import java.util.ArrayList;
import java.util.Iterator;

public class example {

	  public static void main(String[] args) 
	    { 
		  ArrayList<Integer> al = new ArrayList<Integer>(); 
	        al.add(10); 
	        al.add(20); 
	        al.add(30); 
	        al.add(1); 
	        al.add(2); 
	       // al.add(null);
	       //al.add(null);
	        System.out.println(al);
	        // Remove elements smaller than 10 using 
	        // Iterator.remove() 
	        Iterator itr = al.iterator(); 
	        while (itr.hasNext()) 
	        { 
	            int x = (Integer)itr.next(); 
	            if (x < 10) 
	                itr.remove(); 
	        } 
	  
	        System.out.println("Modified ArrayList : "
	                                           + al); 
	      
	    } 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

