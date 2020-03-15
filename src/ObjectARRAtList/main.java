package ObjectARRAtList;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<student> st=new ArrayList<>();
		
		student a=new student("john","mic");
		student b=new student("lisa","nik");
		
		st.add(a);
		st.add(b);
		
		for(student x:st) {
			x.disPlay();
		}
		

}}
