package ARRAYS2D;

import java.util.Scanner;

public class Practice2D {

	public static void main(String[] args) {
	   
		Scanner scan=new Scanner(System.in);
		
		String[]arr=new String[3];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextLine();
			
		}System.out.println(arr[0].substring(0,3));
		 System.out.println(arr[1].substring(0,3));
		 System.out.println(arr[2].substring(0,3));
		
		 System.out.println(".............................................");
		int[][] num1= {{2,3,4,5},
				     {8,9,6,7},
		             {10,11,23,45}};
		
		int[][] num=new int[3][3];
		num[0][0]=2;
		num[0][1]=3;
		num[0][2]=4;
		
		num[1][0]=8;
		num[1][1]=9;
		num[1][2]=6;

		num[2][0]=10;
		num[2][1]=11;
		num[2][2]=23;

		//System.out.println(num1[0][0]);
		
//		for(int i=0; i<num.length; i++) {
//			System.out.print(num[i][i]+" ");
//			
//			
//		}System.out.println();
//		
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				System.out.print(num[i][j]+" ");
				
			}System.out.println();
		}
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				
	String [][] color= {{"Blue","Red","White"},			
	                    {"Yellow","Pink","Orange"},
	                    {"Purpe","Black","Gray"}};
	
	for(int i=0; i<3; i++) {
		for(int j=0; j<3; j++) {
			System.out.println(color[i][j]);
		}
	}
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
				
		for(int i=1; i<3;i++) {
			for(int j=0; j<4; j++) {
				System.out.print(j+"");
			}System.out.println();
		}
		
		System.out.println("_________________________________________________");
		
		char [][] sem= { {'A','B','C'}, {'D','E','F'},{'R','I','O'}
	
		};
		for(int i=0; i<sem.length; i++) {
			for(int a=0; a<sem.length; a++) {
				System.out.print(sem[i][a]);
			}System.out.println();
		}
		
		
		 int[][] a = {
		            {-5,-2,-3,7},
		            {1,-5,-2,2},
		            {1,-2,3,-4}
		        };
		int sum=0;
		   for(int []i:a) {
			   for(int b:i) {
				   if(b<0) {
					   if(b%2!=0) {
						sum++;
		
					   }
				   }
			   }
		   }System.out.println(sum);
		
		
		

	}

}
