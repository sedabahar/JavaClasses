package hAAllMAP;

import java.util.Map;
import java.util.TreeMap;

public class AllMap2 {

	public static void main(String[] args) {
		Map<Integer,String>treeMap=new TreeMap<>();
		
		treeMap.put(1, "Monday");
		treeMap.put(2, "Tuesday");
		treeMap.put(3, "Wednesday");
		treeMap.put(4, "Thursday");
		treeMap.put(5, "Friday");
		treeMap.put(6, "Saturday");
		//treeMap.put(null, "Sunday");
		treeMap.put(9, null);
		treeMap.put(10, null);
		
		System.out.println(treeMap);
		
		
		
		
		
		
		
	}

}
