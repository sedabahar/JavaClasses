package InterfaceandIIIINTERFACE;

public interface WebDriver {
	public void openBroser();
	public void closeBroser();
	public void maximizeWindow();
	public void findElement();

}
class ChromeDriver implements WebDriver{

	@Override
	public void openBroser() {
		// TODO Auto-generated method stub
		
	}@Override
	public void closeBroser() {
	
	}@Override
	public void maximizeWindow() {
		// TODO Auto-generated method stub
		
	}@Override
	public void findElement() {
		// TODO Auto-generated method stub
		
	}
	
}
class firefoxDriver implements WebDriver{

	@Override
	public void openBroser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeBroser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maximizeWindow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		
	}
	public static void main (String[]args) {
		WebDriver x=new ChromeDriver();
		WebDriver y=new firefoxDriver();
		WebDriver z=new firefoxDriver();
	}

}


