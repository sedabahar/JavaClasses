package HASHSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class size {

	public static void main(String[] args) {
		
		HashSet x=new HashSet();
		x.add("Seda");
		x.add("Berke");
		x.add("Bartu");
		x.add("Berke");
		System.out.println(x.size());
		System.out.println(x);
		
		Iterator<String>it=x.iterator();
		while(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
		}
		System.out.println("..............................");
		ArrayList<String>y=new ArrayList<String>();
		y.add("Seda");
		y.add("Berke");
		y.add("Bartu");
		y.add("Berke");
		
		for(String z:y) {
			System.out.println(z);
		}

		
		
		
		
		
		}}