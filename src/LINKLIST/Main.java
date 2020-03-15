package LINKLIST;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		List<Student> list=new LinkedList<>();
		//Teacher v=new Teacher();
		
		list.add(new Student("Emma", "Tommy"));
		Iterator<Student>it=list.iterator();
	while(it.hasNext()) {
		it.next().inf();
	}
		

	}

}
