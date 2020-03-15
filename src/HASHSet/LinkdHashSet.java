package HASHSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkdHashSet  {

	public static void main(String[] args) {
		
		//create a collection that won't allow duplicates
		//and preserve the insertion order
		
		Set<String> fruitSet=new LinkedHashSet();
		
		
		fruitSet.add("Apple");
		fruitSet.add("Banana");
		fruitSet.add("Kiwi");
		fruitSet.add("Grape");
		fruitSet.add("Pinapple");
		fruitSet.add("Banana");
		System.out.println(fruitSet.size());
		System.out.println(fruitSet);
		
		
		List<String>arr=new ArrayList<String>();
		arr.add("Java");
		arr.add("Selenium");
		arr.add("SDLC");
		
		
    System.out.println("-------------Objects from both collections");
		Set<String> linkedSet=new HashSet<>();//LinkedHashSet kullanilir
		linkedSet.addAll(arr);
		linkedSet.addAll(fruitSet);
		
		System.out.println(linkedSet);
		
		
		
		
	}

}
