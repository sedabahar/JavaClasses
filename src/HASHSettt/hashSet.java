package HASHSettt;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
	
	public static void main(String[]args) 
    { 
        HashSet h = new HashSet(); 
  
        // Adding elements into HashSet using add() 
        h.add("India"); 
        h.add("Australia"); 
        h.add("South Africa"); 
        h.add("India");// adding duplicate elements 
  
        // Displaying the HashSet 
        System.out.println(h); 
        System.out.println("List contains India or not:" + 
                           h.contains("India")); 
  
        // Removing items from HashSet using remove() 
        h.remove("Australia"); 
        System.out.println("List after removing Australia:"+h); 
  
        // Iterating over hash set items 
        System.out.println("Iterating over list:"); 
        System.out.println();
        
        Iterator<String> i = h.iterator();
        
        while (i.hasNext()) 
            System.out.println(i.next()); 
        
        System.out.println("......................................................");
        
        
        
        
        
        
        
        
        
        
        
        
    } 
} 
	
	
	