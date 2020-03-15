package ArrayListArrayyyyLISTTTTTTTT;

import java.util.ArrayList;
import java.util.Iterator;

public class ornekcikler {

	public static void main(String[] args) {
		
		ArrayList num=new ArrayList();
		num.add(78);
		num.add(34);
		num.add(35);
		num.add(80);
		
		Iterator it=num.iterator();
		
		while(it.hasNext()) {
			
			int a=(Integer)it.next();
			
			if(a % 5 == 0) {
				
				it.remove();
				System.out.println(num);
			}
		}
		System.out.println("...................................");
	
		
	}}


