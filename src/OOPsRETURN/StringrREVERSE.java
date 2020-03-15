package OOPsRETURN;

import java.util.Random;
import java.util.Scanner;

public class StringrREVERSE {

	private static String myReverse(String str) {
	    String reverse = "";
	    int length = str.length();
	    for( int i = length - 1 ; i >= 0 ; i-- ) {
	       reverse = reverse + str.charAt(i);
	    }
	    return reverse;
	}
	
	
	
	public static void main (String[]args) {
		StringrREVERSE a=new StringrREVERSE();
		System.out.println(a.myReverse("LOVE"));
		
		
	}}
	