package ARREYLER;

import java.util.Scanner;

public class Orneklerr {

	public static void main(String[] args) {
	
	//girilen 10 sayi icerisinden
	//a) 100-200 arasindakisayilarin adedini
	//b) 100 den kucuk sayilarin toplamini
	//c) 200 den buyuk sayilarin 4'e kalansiz bolumlerini ekrana yazdiriniz
	
		int[] num=new int[3];
	Scanner scan=new Scanner(System.in);
	for(int i=0; i<num.length;  i++) {
		System.out.print("Please enter " + (i+1) + ". numbers : ");
		num[i]=scan.nextInt();
	}for(int a: num) {
		System.out.println(a+ " ");
		
	}System.out.println();
	
	for(int i=0; i<num.length;  i++) {
		if(num[i]>100 && num[i]<200) {
			System.out.println("100-200 arasi kucuk sayilar : " + num[i]);
		}if(num[i]<100) {
		
			System.out.println("100 den kucuk sayilar : " + num[i]);
		}if(num[i]>200 && num[i]%4==0) {
		
			System.out.println("200 den buyuk sayilar : " + num[i]);
		}
		
	}System.out.println();

	
	System.out.println("enter price :");
	int price=scan.nextInt();
	
	double dis=0;
	double per=0;
	
	if (price>100 && price<200) {
		per=10;
		dis=price*0.1;
		price-=dis;
		System.out.println(price);
		
	}else if(price<400 && price>210) {
		per=20;
		dis=price*0.2;
		price-=dis;
		System.out.println(price);
	}else if (price<800 && price>410) {
		per=40;
		dis=price*0.4;
		price-=dis;
		System.out.println(price);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
