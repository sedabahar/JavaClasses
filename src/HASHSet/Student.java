package HASHSet;

import java.util.HashSet;
import java.util.Set;

public class Student {
	
	String name;
	int stId;
	

	 Student(String name,int stId) {
		 this.name=name;
		 this.stId=stId;
	}

	public void info() {
		System.out.println(name+stId);
	}
	
	public static void main(String[] args) {
		Set<Student>st=new HashSet<>();
	
		st.add(new Student("John",1234));
		st.add(new Student("Alex",1339));
		
		for(Student x:st) {
			System.out.println(x.name);
			//x.info();
		}
		
		
		  String [][] arr = {{"1", "2", "3"}, {"4", "5"}, {"6", "7"}};
	         for(int i = 0; i < arr.length; i++) {
	             for(int j = 0; j < arr[i].length; j++) {
	                 System.out.print(arr[i][j] + " ");
	              if(arr[i][j].equals("2")) {
	                    break;
	               }
	             }
		System.out.println("---------------------------------------");
		
		
		
		
	}

	}}
