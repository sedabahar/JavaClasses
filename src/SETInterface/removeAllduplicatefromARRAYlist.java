package SETInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class removeAllduplicatefromARRAYlist {

	public static void main(String[] args) {
		
		List<String>aList=new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		 HashSet<String> hset =  new HashSet<String>();
		
		hset.addAll(aList);
		System.out.println(hset);
		
		System.out.println("***************************************");
		
		LinkedList<String>link=new LinkedList<>();
		
		link.add("Morning");
		link.add("Noon");
		link.add("Evening");
		link.add("Night");
		//How can we remove just 1 value from the Set collection
		
		//convert to the ArrayList
		
		List<String>List=new ArrayList<>();
		List.addAll(link);
		System.out.println(List);
		List.remove(1);
		System.out.println(List);
		
	System.out.println("*********************************************");
		//another way to create an object of ArrayList by passing value to the constructor
		List<String>List1=new ArrayList<>(link);
		System.out.println(List1);
		
		
		
		
		
		
		
	}

}
