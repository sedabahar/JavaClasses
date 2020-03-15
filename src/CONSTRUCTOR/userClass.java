package CONSTRUCTOR;

public class userClass {
	
	public static void main(String[]args) {
		userInfo x=new userInfo("Berke","234-90","123 bristow");
		
		
	}
	
	String name,mobileNumber;
	
	userClass(String name,String mobilNumber){
	    this.mobileNumber=mobileNumber;
		this.name=name;
	}
	

}
class userInfo extends userClass {
	String adress;
	userInfo(String name, String mobilNumber,String adress ){
		super(name, mobilNumber);
		this.adress=adress;
		System.out.println(name+" "+mobilNumber+" "+adress);
	}

}




