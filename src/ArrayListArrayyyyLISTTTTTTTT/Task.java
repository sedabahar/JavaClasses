package ArrayListArrayyyyLISTTTTTTTT;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Task {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
     names.add("Emin");
     names.add("Berke");
     names.add("Kuzey");
     names.add("Bartu");
     names.add("Seda");
     
     System.out.println(names.isEmpty());
     System.out.println(names.contains("Berke"));
     System.out.println(names.size());
     for(int i=0; i<names.size();i++) {
    	 System.out.println(names.get(i));
     }
     
     
     
	}

	
}
