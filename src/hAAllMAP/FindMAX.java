package hAAllMAP;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FindMAX {

	public static void main(String[] args) {
		
    Map<String,Integer>map=new LinkedHashMap<>();
		
		map.put("Anna",5600);
		map.put("Elsa",7300);
		map.put("Hana",3500);
		map.put("Lara",6300);
		map.put("Tara",4700);
		
		Set<Entry<String,Integer>>set=map.entrySet();
	     
	     int max=0;
	     String str=" ";
	     for(Entry<String,Integer>a:set) {
	    	 
	    	 if(a.getValue()>max) {
	    		 max=a.getValue();
	    		 str=a.getKey()+" $"+a.getValue();
	    	 }
	     }System.out.println(str);
	     
	     
		
		
		
		
		
      }
		
	}


