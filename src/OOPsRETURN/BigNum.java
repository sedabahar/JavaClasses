package OOPsRETURN;

public class BigNum {
	
	
	static int biggest(int a,int b,int c) {
		if(a>b && a>c) {
			return a;
		}
		else if(b>a && b>c) {
			return b;
			
		}
		return c;
	}
	
	String Week(int day) {
		String week;
		switch(day) {
		case 1:
			week="monday";
			break;
		case 2:
			week="tuesday";
			break;
		case 3:
			week="wednesday";
			break;
		case 4:
			week="thursday";
			break;
		case 5:
			week="friday";
			break;
		case 6:
			week="saturday";
			break;
		case 7:
			week="sunday";
			break;
		default:
			week="Unknown";
		
		}
		return week;
	}
	
	
	
	
	
	public static void main(String[] args) {
	 
		int x=biggest(12,101,5);
		System.out.println(x);
		BigNum y=new BigNum();
		System.out.println(y.Week(5));
       
	}

}
