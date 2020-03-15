package ArrayListArrayyyyLISTTTTTTTT;

import java.util.ArrayList;
import java.util.Iterator;

public class ITERATOR {

	public static void main(String[] args) {
		  ArrayList<String> name=new ArrayList<String>();
		     name.add("Emin");
		     name.add("Berke");
		     name.add("Kuzey");
		     name.add("Bartu");
		     name.add("Seda");
		 Iterator<String> it=name.iterator();
		
		 
		System.out.println( it.next());
		System.out.println( it.next());
		System.out.println( it.hasNext());
		 System.out.println("..............................................");
		 while(it.hasNext()) {
			 //String s=it.next();
			 //if(s.equals("Emin")) {
			 System.out.println(it.next());
		 }
	
	

}}
