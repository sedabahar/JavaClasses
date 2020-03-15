package HASHSettt;

import java.util.HashSet;

public class MethodinHashSet {

	public static void main(String[] args) {
		
		HashSet x=new HashSet();
		
		x.add("Apple");
		x.add("Mango");
		x.add("Banana");
		x.add("Orange");
		
		x.add("Apple");   // addition duplicate element
		
		x.add(null);
		x.add(null);
		System.out.println(x);
		
		
		
		
		
		
		
		
		

	}

}
