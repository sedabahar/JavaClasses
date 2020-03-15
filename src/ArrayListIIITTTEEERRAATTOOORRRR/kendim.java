package ArrayListIIITTTEEERRAATTOOORRRR;

import java.util.ArrayList;
import java.util.Iterator;



public class kendim {

	public static void main(String[] args) {
		
		ArrayList<String> aList = new ArrayList<String>();
		 aList.add("Apple");
	      aList.add("Mango");
	      aList.add("Guava");
	      aList.add("Orange");
	      aList.add("Peach");
	     // aList.remove(3);
	      Iterator it = aList.iterator();
	      String str="";
	      while(it.hasNext()) {
	    	  str = (String) it.next();
	    	 if(str.equals("Orange")) {
	    		 it.remove();
	    	System.out.println(it.next());
	   	 break;
	    	 }
	      }
		
		for(String s:aList) {
			System.out.println(s);
		}
		
		
		
	}

}
