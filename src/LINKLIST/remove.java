package LINKLIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class remove {

	public static void main(String[] args) {
		List<String>x=new ArrayList<String>();
		
		x.add("Seda");
		x.add("Berke");
		x.add("Bartu");
		
	  for(int i=0; i<x.size();i++) {
		  if(x.get(i).length()<=4) {
			  x.remove(i);
		  }
	  }System.out.println(x);
	  
 System.out.println("...........Best way removing element................");
      Iterator<String>it=x.iterator();
      while(it.hasNext()) {
	  String a=it.next();
	  if(a.length()<=4) {
		  it.remove();
	  }
     }System.out.println(x);
		
		
		

	}

}
