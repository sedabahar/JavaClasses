package hAAllMAP;

import java.util.HashMap;
import java.util.Map;

public class guzelOrnek {
	/*Create a Method in Main class using below specification. 
	Method Name: Display. 
	Return Type: Void
	Parameters : Map<String,Integer>
	Logic: 
	First the method will check the given map is empty or not. 
	If the map is not empty print pairs of key and value using loops
	If map is empty simply print "map is empty"*/
		
	public static void dispay(Map<String, Integer> map)  {
	       if (map.isEmpty()){
	            System.out.println("map is empty");
	        }else{
	            for (String keys : map.keySet()) {
	              System.out.println (keys + " : " + map.get(keys));
	            }
	        }
	     }
	  public static void main(String[] args) {
	    HashMap<String, Integer> map = new HashMap<>();
	        map.put("mango", 10);
	        map.put("apple", 30);
	        map.put("orange", 20);
	     dispay(map);
	     map.clear();
	     dispay(map);
	  }				
	
	
	
	
	
	
	
		}
		

