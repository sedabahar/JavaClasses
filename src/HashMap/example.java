package HashMap;

import java.util.HashMap;

public class example {

	public static void main(String[] args) {
		HashMap x=new HashMap();

		x.put("Bahar","Seda");
		x.put("Emin", "Berkem");
		x.put("Kuzey", "Bartum");
		System.out.println(x.replace("Kuzey", "Geveze"));
		System.out.println(x);
		System.out.println(x.containsKey("Kuzey"));
		
	}

}
