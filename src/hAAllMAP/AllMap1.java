package hAAllMAP;

import java.util.LinkedHashMap;
import java.util.Map;

public class AllMap1 {

	public static void main(String[] args) {
		Map<Integer,String>linkMap=new LinkedHashMap<>();
		linkMap.put(1, "Monday");
		linkMap.put(2, "Tuesday");
		linkMap.put(3, "Wednesday");
		linkMap.put(4, "Thursday");
		linkMap.put(5, "Friday");
		linkMap.put(6, "Saturday");
		linkMap.put(null, "Sunday");
		linkMap.put(9, null);
		System.out.println(linkMap);

	}

}
