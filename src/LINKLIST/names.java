package LINKLIST;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class names {

	

	public static void main(String[] args) {
		Set<String>name=new LinkedHashSet<>();
		name.add("Dallas");
		name.add("New York");
		name.add("Orlando");
		name.add("Chicago");
		
		Iterator<String> it=name.iterator();
         
		while(it.hasNext()) {
			String a=it.next();
			if(a.startsWith("D")) {
				it.remove();
				
			}
		}System.out.println(name);
		
	}

}
