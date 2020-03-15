package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ex {

	public static void main(String[] args) {
		Map<String,Integer>classRoom=new HashMap<>();
		
		
		classRoom.put("Instructor",3);
		classRoom.put("Student",80);
		classRoom.put("Tables",20);
		classRoom.put("Chairs",80);
		
		
		Set<Entry<String,Integer>>entrySet=classRoom.entrySet();
		for(Entry<String,Integer>e:entrySet) {
			System.out.println(e);
		}System.out.println("*******************************");
		Iterator<Entry<String,Integer>>it=entrySet.iterator();
		while(it.hasNext()) {
			Entry<String,Integer>its=it.next();
			System.out.println(its);
		}
		
		
		
		
	
		
		
		
		
		

	}

}
