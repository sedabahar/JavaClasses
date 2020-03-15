package ArrayListIIITTTEEERRAATTOOORRRR;

import java.util.ArrayList;

public class remove {

	public static void main(String[] args) {
		 ArrayList<Integer> al = new ArrayList<Integer>(); 
	        al.add(10); 
	        al.add(20); 
	        al.add(30); 
	        al.add(1); 
	        al.add(2); 
	        System.out.println(al);
	        al.remove(al.size()-3);
		    System.out.println(al);
		    al.remove(al.size()-4);
		    System.out.println(al);
		
		

	}

}
