package LINKLIST;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		
		
		LinkedList<String> llist=new LinkedList<>();
		
		llist.add("Hello");
		llist.add("Bye");
		llist.add("Hello");
		llist.add("Bye");	
		llist.add(2,"How are you?");
		System.out.println(llist);
		
		//replace 1 element
		llist.add(1,"Good bye");
		String element=llist.get(2);
		System.out.println(element);
		
		System.out.println("1. way ....................");
		for(int i=0;i<llist.size();i++) {
			System.out.println(llist.get(i));
		}
		
		System.out.println("2. way ....................");
		for(String x:llist) {
			System.out.println(x);
		}
		
		System.out.println("3. way ....................");
		Iterator<String>it=llist.iterator();
		
		while(it.hasNext()) {
			String a=(String)it.next();
			System.out.println(a);
		}
		System.out.println("4. way ....................");
		
		
		
		
		
		
		
		
		
		
		
	}

}
