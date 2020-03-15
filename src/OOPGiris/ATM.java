package OOPGiris;

import java.util.Scanner;

public class ATM {

	public void calis(Hesap hesap) {
	Login login=new Login();
	Scanner scan=new Scanner(System.in);
	
	while(true) {
		

     if(login.login(hesap)) {
			System.out.println("WELCOME...");
			break;
    }else {
			System.out.println("INCORRECT ENTER");
		    return;
		}	

	}		
   
   
		String islem="1.See account"+
	                 "2.withdra\\n" + 
	                 "3.withdra\\n"+
	                  "to exit press q";
		
	while(true) {
		 System.out.println("islem sec :");
		    String is=scan.nextLine();
		if(is.equals("q")) {
			break;
		}else if(is.equals("1")){
			
			System.out.println("Amount : "+hesap.getAccount());
		}
		else if(is.equals("2")) {
			System.out.println("Enter amount");
			int amount=scan.nextInt();
			scan.nextLine();
			hesap.withdra(amount);
		}else if(is.equals("3")) {
			System.out.println("Enter amount");
			int amount=scan.nextInt();
			scan.nextLine();
			hesap.deposit(amount);
		}else {
			System.out.println("Invalid ");
		}
		
		
	}
	
	
	
	
	
	
	
	
		
		
		
		
	}
		
	}

	
	
	
	


