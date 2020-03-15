package OOPsRETURN;

public class Asal {


	static boolean asal(int num) {
		boolean x=true;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				x=false;
				break;
			}
		}return x;
	}
	
	
	
	public static void main(String[] args) {
		
	if(asal(13)) {
		System.out.println("prime");
	}else {
		System.out.println("not");
	}}}
	