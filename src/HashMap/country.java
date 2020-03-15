package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class country {

	public static void main(String[] args) {
	Map<String,String>co=new HashMap<>();
	
	co.put("Ankara", "Turkey");
	co.put("DC", "Washington");
	co.put("Tokyo", "China");
	
	Set<String>keySet=co.keySet();
	
	for(String x:keySet) {
		System.out.println(x);
	}System.out.println("--------2.WAY");
	Iterator<String>it=keySet.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		
	}System.out.println("---------------------for");	
	for(String y:keySet) {
		System.out.println(y+":"+co.get(y));
	}System.out.println("---------------------for");
	Iterator<String>it1=keySet.iterator();
	while(it1.hasNext())	{
		String mapKey=it1.next();
		String mapValue=co.get(mapKey);
		System.out.println(mapKey+" "+mapValue);		
		
		
		
	}
	
	}

}
