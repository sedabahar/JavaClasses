package SETInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class set {
	
	public static void main(String[] args) {
		Set<Double>set=new LinkedHashSet<>();
		set.add(99.99);
		set.add(90.99);
		set.add(9.99);
		
		Iterator<Double> it=set.iterator();
		while(it.hasNext()) {
			double a=it.next();
			if(a<50) {
				it.remove();
			}
			
		}
		System.out.println("...........................");
		for(Double d:set) {
			System.out.println(d);
		}
		System.out.println("...........................");
		
		
		
		
	
	
	

}}
