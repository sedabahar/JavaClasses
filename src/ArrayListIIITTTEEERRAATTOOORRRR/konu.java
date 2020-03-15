package ArrayListIIITTTEEERRAATTOOORRRR;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class konu {

	public static void main(String[] args) {
		
		  ArrayList<String> name=new ArrayList<String>();
		     name.add("Emin");
		     name.add("Berke");
		     name.add("Kuzey");
		     name.add("Bartu");
		     name.add("Seda");
		 ListIterator<String> it=name.listIterator();
		 
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
		 	
		 	
//add dedigimiz zaman 1,"john"
//1.index yerine "john" ekle demek
		 
//remove da ayni  remove(2) demek 2.indek i cikar demek		 
		
		
		
		
		
	}

}
