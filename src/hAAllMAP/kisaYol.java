package hAAllMAP;

import java.util.HashMap;
import java.util.Map;

public class kisaYol {
	public static void main(String[] args) {
		Map<Integer,String>hashMap=new HashMap<>();
		hashMap.put(1, "Monday");
		hashMap.put(2, "Tuesday");
		hashMap.put(3, "Wednesday");
		hashMap.put(4, "Thursday");
		hashMap.put(5, "Friday");
		hashMap.put(6, "Saturday");
		hashMap.put(null, "Sunday");
		

		for(Integer key:hashMap.keySet()) {
			System.out.println(key+" "+hashMap.get(key));
		}
		
		
		
		
	}

}
