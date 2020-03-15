package OOPsRETURN;

public class Calculater {
	
	
	 int sum(int a,int b) {
		int sum=a+b;
		return sum;
	}
	
    int sub(int a,int b) {
		int sub=a-b;
		return sub;
	}
    int mul(int a,int b) {
		int mul=a*b;
		return mul;
	}
   int div(int a,int b) {
		int div=a/b;
		return div;
	}boolean odd(int num){
		boolean isodd=true;
		
		if(num%2!=0) {
			isodd=true;
		}else{
			isodd=false;
		}return isodd;
	}
	
	
	
	public static void main(String[] args) {
		Calculater x=new Calculater();
		System.out.println(x.sum(4, 15));
        System.out.println(x.sub(15,2));
        System.out.println(x.mul(12, 4));
        System.out.println(x.div(200, 2));
        System.out.println(x.odd(3));
	}

}
