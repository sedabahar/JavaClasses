
public class STRINGarrayARRAYtoOSTRING {
	

private String[] Array(String x) {
	
	return x.split(" ");
}



public static void main(String[] args) {
	
	STRINGarrayARRAYtoOSTRING a=new STRINGarrayARRAYtoOSTRING ();
	
	String[]strArray=a.Array("I will be successful on JAVA");
	for(String y:strArray) {
		System.out.println(y);
	}

	
	
}

}










