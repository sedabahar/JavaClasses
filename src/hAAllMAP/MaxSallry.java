package hAAllMAP;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaxSallry {

	public static void main(String[] args) {
	Map<String,Integer>map=new LinkedHashMap<>();
	
	map.put("Seda", 15000);
	map.put("Anna", 10000);
	map.put("Lina", 10000);
	map.put("Emma", 8000);
	

	Set<Entry<String,Integer>>set=map.entrySet();
	int max=0;
	String str=" ";
	for(Entry<String,Integer>a:set) {
		if(a.getValue()>max) {
			max=a.getValue();
			str=a.getKey()+" $"+a.getValue();
			
		}
	}System.out.println(str);
		
		
		
		
	}

}
