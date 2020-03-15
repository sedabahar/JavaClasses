package ArrayListArrayyyyLISTTTTTTTT;

import java.util.ArrayList;
import java.util.Iterator;

public class example1 {
	public static void main(String[] args) {
		
	        ArrayList al = new ArrayList(); 
	  
	        for (int i = 0; i < 10; i++) 
	            al.add(i); 
	  
	        System.out.println(al); 
	  
	        // at beginning itr(cursor) will point to 
	        // index just before the first element in al 
	        Iterator it = al.iterator(); 
	  
	        // checking the next element availabilty 
	        while (it.hasNext()) 
	        { 
	            //  moving cursor to next element 
	            int i = (Integer)it.next(); 
	  
	            // getting even elements one by one 
	            System.out.print(i + " "); 
	  
	            // Removing odd elements 
	            if (i % 2 != 0) 
	               it.remove();  
	        } 
	        System.out.println();  
	        System.out.println(al); 
	    } 
	} 
