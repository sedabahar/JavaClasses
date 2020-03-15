package HASHSet;

import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
	
		HashSet x=new HashSet();
		x.add(null);
		x.add("Seda");
		x.add("Berke");
		x.add("Bartu");
		x.add(null);
		x.add(null);
		x.add(null);
		x.add(null);
		System.out.println(x);
		Object []array=x.toArray();
		System.out.println(array[2]);
		
		
		
		

	}

}
