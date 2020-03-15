package com.class7;

public class IncremantAndDecrement {

	public static void main(String[] args) {
		int a=10;
		
		a=a+1;
		a+=1;
		a++;// increment operator
		System.out.println(a);
		
		int b=10;
		b-=1;
		b--;//decrement operator
		System.out.println(b);
		
		//print values from 50 to 20
		
		int i=50;
		
		while(i>=20) {
			
			System.out.println(i);
			i--;
		}
		
		//I want to print all even number from 1 to 20 inclusive
		
		
		int z=2;
		
		while(z<=20) {
			System.out.println(z);
			z+=2;
		}
		// 2 way using modulus
		
		int q=2;
		while(q<=20) {
			
			if(q%2==0) {
				System.out.println(q);	
			}
			q++;
		}
		//print only odd number from 50 to 100
		//print only even numbers from 100 to 1
		int c=51;
		while(c<100) {
			if (!(c%2==0)) {
				System.out.println(c);
			}
			c+=2;
			
		}
		
		//
		int m=100;
		while(m>1) {
			if (m%2==0) {
				System.out.println(m);
			}
			m-=2;
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
