package HASHSet;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreSet {

	public static void main(String[] args) {
		Set<String> fruitSet=new TreeSet<>();
		
		fruitSet.add("Apple");
		fruitSet.add("Banana");
		fruitSet.add("Kiwi");
		fruitSet.add("Grape");
		fruitSet.add("Pinapple");
		fruitSet.add("Banana");
		System.out.println(fruitSet.size());
		System.out.println(fruitSet);

	}

}
