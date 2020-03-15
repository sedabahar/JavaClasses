package HASHSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class alphabetical {
	
	/*
Create a Set collection in which you need to add names of the countries.
 In this set we want all objects to be sorted in alphabetical order. 
 Using 2 different ways retrieve all elements from set.
Create a Set of cities in which you want to make sure that insertion order is maintained. 
Using Iterator remove any city that starts with “A”;
Create a Set collection that will hold Objects of Student Type. 
In this set we do not care about the insertion order.
 Each student object should have name and studentID. Display name of each student.*/

	public static void main(String[] args) {
		
		System.out.println(".------------ALphabetical order----------------");
		
		Set<String>name=new LinkedHashSet<>();
		
		name.add("Dallas");
		name.add("New York");
		name.add("Orlando");
		name.add("Chicago");
		
		for(String x:name) {
			System.out.println(x);
		}
		System.out.println(".------------ALphabetical order----------------");
		Iterator<String>it=name.iterator();
		while(it.hasNext()) {
			String a=it.next();
			if(a.toUpperCase().startsWith("C")) {
				it.remove();
			}
		}System.out.println(name);
		
		
		
	}

}
