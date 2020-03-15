package OOPGiris;

public class Hesap {
	
	private String username,password;
	private int account;
	public Hesap(String username, String password, int account) {
		super();
		this.username = username;
		this.password = password;
		this.account = account;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	
	public void withdra(int amount) {
		if(account-amount<0) {
			System.out.println("You can not wuthdra");
		}else {
			account-=amount;
			System.out.println("New account :"+account);
		}
	}public void deposit(int amount) {
		amount+=account;
		System.out.println("New account :"+amount);
	}
	

	
	

}
