package HashMap;

import java.util.HashMap;

public class IntAndSTring {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<>();
		map.put(101,"John");
		map.put(102,"Jack");
		map.put(103,"Jane");
		map.put(104,"Jenny");
		
		System.out.println(map);
		//how to verify if there any elements inside map
		boolean x=map.isEmpty();
		if(!x) {
		int size=map.size();
		System.out.println(size);
		
		}
		// I want to add more Entry Objects
		map.put(105,"Emma" );
		System.out.println(map);
		System.out.println(".....................");
		//adding duplicate value ---OK
		map.put(103,"Enna");
		map.put(105,"Christina" );
		System.out.println(map);
		
		//how to accses to value
		String a=map.get(103);
		String c=map.get(102);
		System.out.println(c);
		System.out.println(a);
		//how to remove  an Object from map
		
		map.remove(104);
		System.out.println(map);
		
		//how to verify if certain key is exist
		
		boolean flag=map.containsKey(103);
		System.out.println(flag);
		if(flag) {
			map.replace(103, "Michel");
		}else {
			map.put(103, "Michel");
		}
		
		//how to verify if certain value is exist
		boolean contains=map.containsKey("Michel");
		System.out.println(contains);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
