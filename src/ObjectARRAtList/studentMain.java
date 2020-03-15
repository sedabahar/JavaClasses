package ObjectARRAtList;

import java.util.ArrayList;
import java.util.Iterator;

public class studentMain {

	public static void main(String[] args) {
		ArrayList<student> stu=new ArrayList();
		
		student a=new student("Berke", "Demirkiran");
        student b=new student("Bartu", "Demirkiran");
        
        stu.add(a);
        stu.add(b);
        
      
        for(student x:stu) {
        	x.disPlay();
        }
        
     
       
        
        
        
        
        
        
	}
	
	

}
