package HashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class mapp {

	public static void main(String[] args) {
		//create map of a person(name,lastName,address,city,state
		
		Map<String,String>personMap=new LinkedHashMap<>();
		personMap.put("Name", "Jace");
		personMap.put("LastName", "Dowson");
		personMap.put("Adress", "123 Text");
		personMap.put("Adress", "123 Text");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");
		System.out.println(personMap);
		//how to retrieve a specific value?
		String a=personMap.get("LastName");
		System.out.println(a);
		//how to retrieve all keys and all value?
		System.out.println("--------Printing all keys------------");
		
		Set<String>keys=personMap.keySet();
	
		System.out.println();
		
		Iterator<String>it=keys.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

		System.out.println("--------Printing all keys------------");
		for(String x:keys) {
			System.out.println(x);
		}
		//how can I retrieve and print value key:valuenusing loop
		System.out.println("--------Printing all keys and value------------");
		for(String y:keys) {
			System.out.println(y+":"+personMap.get(y));
		}
		
		while(it.hasNext()) {
			System.out.println(it.next()+personMap.get(it.next()));
		}System.out.println("--------Printing all keys and value------------");
		Iterator<String>its=keys.iterator();
		while(its.hasNext()) {
			String mapKey=its.next();
			String mapValue=personMap.get(mapKey);
			System.out.println(mapKey+"-"+mapValue);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
