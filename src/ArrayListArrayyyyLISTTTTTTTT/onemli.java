package ArrayListArrayyyyLISTTTTTTTT;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class onemli {

	public static void main(String[] args) {
		
		ArrayList<String> cars=new ArrayList<String>();
		System.out.println("1  ...............................................");
		cars.add("Lexsus");
		cars.add("BMW 520");
		cars.add("BMW x6");
		
		for(String c: cars) {
			System.out.println(c);
		}System.out.println();
		System.out.println("2  ...............................................");
		for(int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		System.out.println();
		System.out.println("3  ...............................................");
		Iterator it=cars.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}System.out.println();
		System.out.println("4  ...............................................");
		

	}}


