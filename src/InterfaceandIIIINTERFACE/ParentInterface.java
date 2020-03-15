package InterfaceandIIIINTERFACE;

public interface ParentInterface {
	  void parentMethod();


}
interface childInterface extends ParentInterface {
	void child();
}
class Ma implements childInterface{

	@Override
	public void parentMethod() {
		System.out.println("Parent Method-----welcome to syntax solutions");
		
	}
	@Override
	public void child() {
		System.out.println("Child Method-----hi syntax solutions how are you");
		
	}
	  public static void main(String[] args){
Ma x=new Ma();
x.parentMethod();
x.child();
}

		
}
	

	



