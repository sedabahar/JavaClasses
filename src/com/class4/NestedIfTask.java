package com.class4;

public class NestedIfTask {

	public static void main(String[] args) {

		boolean diploma = true;
		double gpaScore = 2.5;

		if (diploma) {
			System.out.println("Cong");

			if (gpaScore > 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should study harder");
			}

		} else {
			System.out.println("Get a dgree");
		}

		// 2
		int price = 100000;//double price=100000
		double morrate = 21.5;
		

		if (morrate > 4.5) {
			System.out.println("Will not buy a house");
			if (price > 200000) {
				System.out.println("Take a loan");
			} else {
				System.out.println("pay cash");
			}

		} else {
			System.out.println("consider buying");
			
		}

	}

}
