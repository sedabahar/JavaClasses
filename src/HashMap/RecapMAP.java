package HashMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RecapMAP {

	public static void main(String[] args) {
		Map<String,Integer>grocerMap  =new LinkedHashMap<>();
		grocerMap.put("Milk",2 );
		grocerMap.put("Tea",35 );
		grocerMap.put("Onion",5 );
		grocerMap.put("Apple",10 );
		
		//retrieve single value
		grocerMap.get("Apple");
		grocerMap.containsKey("Milk");
		grocerMap.containsValue(2);
		
		//how to retrieve all values
		
		Collection<Integer>values=grocerMap.values();
		for(Integer val:values) {
			System.out.print(val+" ");
		}System.out.println();
		Iterator<Integer>it=values.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		// get all keys and map them to values(milk----2)
		
		Set<String>setK=grocerMap.keySet();
		
		for(String key:setK) {
			System.out.println(key.toUpperCase()+"-->"+grocerMap.get(key));
		}
		System.out.println("************************************");
		Iterator<String>it2=setK.iterator();
		while(it2.hasNext()) {
			String x=it2.next();
			System.out.println(x+"---->"+grocerMap.get(x));
		}
		
		
		
		
		
		
		
	}

}
