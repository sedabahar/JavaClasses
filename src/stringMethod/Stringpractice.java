package stringMethod;



public class Stringpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Create a 2D array or integer type where you will store odd and
		 *  even numbers in 3 rows and 4 columns. Develop a program which will 
		 *  identify/print the even numbers only.*/
			
				int[][] num= {{1,2,3,4},
					      {5,6,7,8},
						      {9,10,11,12}};
				int sum=0;
				int sum1=0;
				for(int i=0;i<num.length;i++) {
					for(int j=0; j<num.length; j++) {
						if(num[i][j]%2==0) {
							System.out.println("even"+num[i][j]);
							sum=sum+num[i][j];
						}else {
							 System.out.println("odd"+num[i][j]);
							 sum1=sum1+num[i][j];
						}

					}}System.out.println(sum);
				      System.out.println(sum1);
				System.out.println("-----------------------------------------------");
				//Create a 2D array or integer type and store numbers in 3 rows and 3 columns. 
				  //    Print the sum of all numbers.
				      
				  System.out.println(".............................................");    
				 int[][] nu= {{11,17,18},
						      {14,15,16},
						      {17,18,19}};     
				      int su=0;
				     
				      for(int b=0;b<nu.length;b++) {
				    	  for(int j1=0;j1<nu.length;j1++) {
				    		  su=su+nu[b][j1];
				    		 
				    	  }}
			 System.out.println(su);
			 System.out.println("................................................");
			 //Create a 2D array of integer type with 3 rows and 4 columns and
			 //print all values of the whole array.
			 
			 int [][] number= {{23,45,67},
					           {43,21,86},
					           {46,70,90}};
			 
			 
				for(int m=0; m<number.length;m++) {
					for(int n=0;n<number.length;n++) {
						
					}
				}for(int[]h:number) {
					for(int y:h) {
						System.out.print(y+" ");
					}
					
				}	
			 System.out.println("..................................................");
			 
			 //Create a 2D array where you will store the following values: 
			 //Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
			 
			 String[][] array= {{"Mr","Mrs","Ms","Miss"},
			            {"Smith","Jordan","Jackson","Obama"}
			            };
			 
			 System.out.println(array[0][0]+" "+array[1][0]+"\n"+
					            array[0][1]+" "+array[1][1]+"\n"+
					            array[0][2]+" "+array[1][2]+"\n"+
					            array[0][3]+" "+array[1][3]);
			 
			 
			 
			 
		
		
		
		
		
		
		
		
		
		

	}

}
