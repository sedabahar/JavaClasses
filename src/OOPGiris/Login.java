package OOPGiris;

import java.util.Scanner;

public class Login {
	
	public boolean login(Hesap hesap) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Enter username :");
		String us=scan.nextLine();
		System.out.print("Enter password");
		String pass=scan.nextLine();
		

if(hesap.getUsername().contentEquals(us) && hesap.getPassword().contentEquals(pass)) {
	return true;
}else {
	return false;
}
	
	
	
	
	
	
	
		
	}
	
	
	
	

}
