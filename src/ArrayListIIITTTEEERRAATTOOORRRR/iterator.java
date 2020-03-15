package ArrayListIIITTTEEERRAATTOOORRRR;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class iterator {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mananas");
		list.add("Ashburn");
		list.add("Fairfax");
		list.add("Vienna");
		

		TreeSet map = new TreeSet();
		
		map.add("one");
		map.add("two");
		map.add("three");
		map.add("four");
		map.add("one");
		
		Iterator<String>it=map.iterator();
		
		while (it.hasNext() ) 
		{
		String x=it.next();
		System.out.println(x);
		}
		
		
		
		
		
		
		
	  /*  while(it.hasNext()) {
	    	if(it.next().equals("Fairfax")) {
	    		it.remove();
	    	}
	    }*/
		
		
		
		
		
		
		
		
		

	}

}
