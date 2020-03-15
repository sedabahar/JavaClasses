package ArrayListArrayyyyLISTTTTTTTT;


import java.util.ArrayList;
import java.util.Iterator;

public class task4 {

	  public static void main(String[]args){
		    ArrayList<Integer> A=new ArrayList<Integer>();
		    
		  
		  for(int i=0;i<50;i++) {
			  if(i%2==0) {
				  A.add(i);
				  
			  }
		  }System.out.println(A);
		  
		  Iterator<Integer> it=A.iterator();
		  while(it.hasNext()) {
			  if(it.next()%5==0) {
				  it.remove();
			  }
		  }System.out.println(A);
		  
		  
		    
		  }}




