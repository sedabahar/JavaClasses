package HASHSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		//create a collection that will store Sweets type of object and
		//I do not care about the order as long as I do not have duplicate object
		
		Set<Student> st=new HashSet<>();
		
		Student x=new Student("John", 1234);
		
		
		st.add(new Student("Alex",4567));
		st.add(new Student("Lina",190));
		st.add(new Student("Hany",1792));
		st.add(x);
		
		System.out.println(st.size());
		System.out.println("--------------1 way");
		for(Student element:st) {
 System.out.println(element.name);//neyi bastirmak istiyorsan onu muhakkak yaz ((name)) gibi
		}
		System.out.println("--------------2 way");
		
		Iterator<Student>it=st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().name);
		}
		
		
		
		
		
		
	}

}
