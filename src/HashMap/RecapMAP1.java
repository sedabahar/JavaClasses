package HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class RecapMAP1 {

	public static void main(String[] args) {
		Map<Integer,String>map=new TreeMap<>();
		
		map.put(3456 ,"Mac Loptop");
		map.put(6746 ,"HP Printer");
		map.put(3468 ,"Dell Screen");
		map.put(8753 ,"Samsung TV");
		map.put(1765 ,"Sonny Camera");
		System.out.println(map);
		
		//to retrieve key - values using entry set
		
		
		Set<Entry<Integer,String>>set=map.entrySet();
				
		
       for(Entry<Integer,String>entry:set){
	    	System.out.println(entry.getKey());
	    	System.out.println(entry.getValue());
	    }
		System.out.println("--------Retriving key and value using iterator");
		Iterator<Entry<Integer,String>>it=map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer,String> singleEntry=it.next();
			int key=singleEntry.getKey();
			String value=singleEntry.getValue();
			System.out.println(key+" "+value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
