package CONSTRUCTOR;

public class Account {
	//we can not create constructor as static
	private String name;
	private String lastName;
	private int account;
	
	
	
	public Account(String name, String lastName, int account) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.account = account;
	}
	
	public Account(int account) {
		
		this("Emy","Jordon",account);
		
		
	}
	public Account(String name) {
		this(name,"Jhan",2000);
	}
	
	public void withdraw(int amount) {
		if(account-amount<0) {
			System.out.println("Not enough money");
		}else {
			account-=amount;
			System.out.println("New account "+account);
		}
	}
	public void deposit(int amount) {
		account+=amount;
		System.out.println("New account "+account);
		
	}
	
	public void information() {
		System.out.println("Account :"+account);
		System.out.println("Costumer name is :"+name);
		System.out.println("Costumer LastName is :"+lastName);
	}
	
	
	

}
