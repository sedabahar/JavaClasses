package hAAllMAP;

import java.util.LinkedHashSet;
import java.util.Set;

public class concatenateString {

	public static void main(String[] args) {
		/*Create the collection that will store single unique 
		 * Objects of a String type in which order is preserved.
	Write a logic to concatenate all string from the collection.*/
		
		Set<String>str=new LinkedHashSet<>();
		
		str.add("LinkedHashSet");
		str.add("keeps");
		str.add("the");
		str.add("insertion");
		str.add("order");
		str.add("and");
		str.add("does");
		str.add("not");
		str.add("allow");
		str.add("duplicates");
		
		for(String s:str) {
			System.out.print(s+" ");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
