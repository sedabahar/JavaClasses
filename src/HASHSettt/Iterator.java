package HASHSettt;
import java.util.HashSet;

public class Iterator {

	public static void main(String[] args) {
		
		HashSet x=new HashSet();
		x.add("Chaitanya");
		x.add("Rahul");
		x.add("Tim");
		x.add("Rick");
		
		java.util.Iterator it=x.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
