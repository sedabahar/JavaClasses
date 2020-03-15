package HASHSet;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Message {
	
}
 
 class Guest {
     public static void main(String [] args) {
    	  LocalDate date = LocalDate.parse("1980-03-16");
          System.out.println(date.minusYears(-5));
    	 
    	 System.out.println("*******************************");
    	 String str1 = " ";
         boolean b1 = str1.isEmpty();
         System.out.println(b1);
         //str1.trim();
         b1 = str1.isEmpty();
         System.out.println(b1);
    	 System.out.println("*******************************");
    	 
    	 
    	  final String fName = "James";
    	  
          String lName = "Gosling";
          
          String name1 = fName + lName;
          
          String name2 = fName + "Gosling";
          
          String name3 = "James" + "Gosling";
          
          System.out.println(name1 == name2);
          System.out.println(name2 == name3);
         
          
          System.out.println("-----------------------------------");
          
          List<String> dryFruits = new ArrayList<>();
          dryFruits.add("Walnut");
          dryFruits.add("Apricot");
          dryFruits.add("Almond");
          dryFruits.add("Date");
  
          ListIterator<String> iterator = dryFruits.listIterator();
          while(iterator.hasNext()) {
              if(iterator.next().startsWith("A")) {
                  iterator.remove();
               }
          }
  
          System.out.println(dryFruits);
     }
        
        
        
    }


