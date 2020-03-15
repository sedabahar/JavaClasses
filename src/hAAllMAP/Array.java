package hAAllMAP;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Array {

	public static void main(String[] args) {
		
		String[]city= {"Istanbul","Gaziantep","Izmir","Mersin"};
		
		Map<String,Integer>map=new TreeMap<>();


		
		for(String a:city) {
			map.put(a,a.length());
		}
		System.out.println(map);
		
		Set<Entry<String,Integer>>set=map.entrySet();
	
		Iterator<Entry<String,Integer>>it=set.iterator();
		
		while(it.hasNext()) {
			String x=it.next().getKey();
			if(x.length()>7) {
				it.remove();
			}
		}System.out.println(map);
		
		
		
		
		
		
		
		
	}

}
