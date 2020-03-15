package Encapculation.ENCAPSULATION;

public class Registration {
	
	private String email,userName,password;
	


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		
		if (email.contains("gmail.com")) {
 			this.email = email;
 		} else {
 			System.out.println("Invalid email type. Email must be gmail");
 		}
 	
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		    
		if (!userName.isEmpty()) {
 			if (userName.length() > 6) {
 				this.userName = userName;
 			} else {
 				System.out.println("Username should have more than 6 characters");
 			}
 		} else {
 			System.out.println("Username cannot be empty");
 		}}
		
	          
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		
		if(password.length()-1<6 && password.length()-1>=0) {
			System.out.println("InValid passport");
		}else {
			System.out.println("Valid Password");
		}
		
	}
	
	
	public static void main(String[]args) {
		Registration x=new Registration();
		x.password="Amustafa1984";
		x.setEmail("gmail");
		x.setUserName("1236890");
		x.setPassword("123456");
		
	    
	}
	
	
	/*Create Registration Class in which you would
	 * have variables as email, userName and password
	 * that have an access scope only within its own class.
	 * After creating an object of the class user should be able
	 * to call methods and in each method separately pass values to set
	 * users email, username and password.
	 {
	private String email;
	private String userName;
	private String password;
	public String getEmail()
	{
		 return email;
	}
	public String getuserName()
	{
		 return userName;
	}
	public String getpassword()
	{
		return password;
	}
	public void setEmail()
	{
		if(email.equals(".gmail.com"))
		System.out.println("please enter your password");
		else {
			System.out.println("Please follow instructions");
		}
	}
	public void setName()
	{
		if(userName.isEmpty())
		System.out.println("please enter your name " +userName);
	}
	public void setpassword(String password)
	{
		 if
		((password.valueOf(password).length()>=7)&&(!password.isEmpty()))
		 {
				this.password=password;
			System.out.println(" good strength");
		}
		else {
			System.out.println("not valid password");
		}
		...........................................
		Registeration r =new Registeration();
String name=r.getuserName();
name="john";
System.out.println(name);
String mail=r.getEmail();
mail="gmail.com";

System.out.println(mail);
String password=r.getpassword();
password="gggjjjjk";
System.out.println(password);
r.setpassword("");


	}*/
	
	
	
	
	

}
