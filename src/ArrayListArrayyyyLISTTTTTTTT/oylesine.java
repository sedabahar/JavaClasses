package ArrayListArrayyyyLISTTTTTTTT;

import java.util.ArrayList;
import java.util.Iterator;

public class oylesine {

	public static void main(String[] args) {
	
		ArrayList list=new ArrayList();
		

		list.add(10);
		list.add(201);
		list.add(31);
		list.add(38);
		
		Iterator it=list.iterator();
		
		while(it.hasNext()) {
			
			int i=(Integer)it.next();
			
			if(i%5==0) {
				it.remove();
				System.out.println(list);
			
			
		}
		
		

		
		
	}}}


