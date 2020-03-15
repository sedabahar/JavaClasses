package ARREYLER;

import java.time.LocalTime;
import java.util.Scanner;

public class ben {
	 public String name;
     public void Test() {
         name = "James";
     }
     
	   public static void main(String[] args) {
		  
	       
	            ben obj = new ben();
	            System.out.println(obj.name);
		   System.out.println(1 + 2 + 3 + 4 + "Hello");
	       /* int a = 20;
	        int var = --a * a++ + a-- - --a;
	        System.out.println("a = " + a);
	        System.out.println("var = " + var);*/
		   
		   
		   
		   int a = 7;
	        boolean res = a++ == 7 && ++a == 9 || a++ == 9;
	        System.out.println("a = " + a);
	        System.out.println("res = " + res);
	    
	        
	        int a1 = 100;
	        System.out.println(-a1++);
	        
	        System.out.println("...............");
	        String msg = "Hello";
	        boolean [] flag = new boolean[1];
	        if(flag[0]) {
	            msg = "Welcome";
	        }
	        System.out.println(msg);
	        
	        int [] arr1 = {1, 2, 3};
	        int [] arr2 = {'A', 'B'}; //ASCII code of 'A' is 65, 'B' is 66
	        arr1 = arr2;
	        for(int i = 0; i < arr1.length; i++) {
	            System.out.print(arr1[i] + " ");
	        }
	       /* System.out.println(args.length);
	        System.out.println("............");
	        String [] arr = new String[1];
	        System.out.println(arr[0].isEmpty());*/
	        
	        
	      /*  int start = 1;
	        int sum = 0;
	        do {
	            if(start % 2 == 0) {
	                continue;
	            }
	            sum += start;
	        } while(++start <= 10);
	        System.out.println(sum);*/
	        //int [] arr11 = {3, 2, 1};
	       // for(int i : arr11) {
	         //   System.out.println(arr11[i]);
	        //}
	        
	      
	      
	          
	        
	       
	    }
	}
	

	

