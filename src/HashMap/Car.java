package HashMap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Car {
	
	String make,model;
	public Car(String make,String model) {
		this.make=make;
		this.model=model;
	}
	
	public void display() {
		System.out.println(make+" "+model);
	}
	
	

	public static void main(String[] args) {
		Map<Integer,Car>mapCar=new LinkedHashMap<>();
		mapCar.put(1, new Car("BMW","X6"));
		mapCar.put(2, new Car("Tesla","S"));
		mapCar.put(3, new Car("Mercedes","S5"));
		mapCar.put(4, new Car("Toyota","Rav4"));
		mapCar.put(5, new Car("Honda","Civic"));
		mapCar.put(6, new Car("Lincoln","S"));
		
		System.out.println(mapCar.size());
		//display only objects
		
		Collection<Car>coll=mapCar.values();
		for(Car c:coll) {
			System.out.println(c.make+"----"+c.model);
			//c.display();
			
		}//map key to its corresponding values (entrySet or keySet )
		
		Set<Entry<Integer,Car>>set=mapCar.entrySet();
		
		for(Entry<Integer,Car>ent:set) {
			Integer i=ent.getKey();
			Car c1=ent.getValue();
			System.out.println("Key "+i +" is associated with value of "+c1.make);
		}
			
		//using keyset to map keys to values
		System.out.println("...........................");
		Set<Integer>keySet=mapCar.keySet();
		for(int key:keySet) {
			//System.out.println(key+" "+mapCar.get(key).make);
			Car car=mapCar.get(key);
			String carDetails=car.make+"---"+car.model;
			System.out.println(key+"="+carDetails);
		}System.out.println("...........................");
			
			
		
		
		
		
		
		
		
		
		
		
	}

}
