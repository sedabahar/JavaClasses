package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapentry {

	public static void main(String[] args) {
		//create map a classroom in which we will store object and it is qualities
		Map<String,Integer>classRoom=new HashMap<>();
		classRoom.put("Instructor",3);
		classRoom.put("Student",80);
		classRoom.put("Tables",20);
		classRoom.put("Chairs",80);
		System.out.println(classRoom.values());
		//key + value = gives you one ENTRY(EN tii)
		// key=getKey();
		//value=getValue();
		System.out.println(	classRoom);
		
		Set<Entry<String,Integer>>entrySet=classRoom.entrySet();
		
		System.out.println("-------using For Loop to get all Entry object");
		System.out.println("..............................   ");
		for(Entry<String,Integer> entry:entrySet) {
			System.out.println(entry);
			//System.out.println(entry.getKey()+":"+entry.getValue());
		}System.out.println("..............................   ");
		System.out.println("-------using Iterator to get all Entry object");
		
		Iterator<Entry<String,Integer>> it=entrySet.iterator();
		while(it.hasNext()) {
			Entry<String,Integer>its=it.next();
			String entry=its.getKey()+"------"+its.getValue();
			System.out.println(entry);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
