package com.class3;

public class IfElsif {

	public static void main(String[] args) {

		int day = 6;

		if (day == 2) {
			System.out.println("Today is Monday. I have to go to work");
		}

		else if (day == 3) {
			System.out.println("Today is Wednesday. I have Java Review class");
		} else if (day == 4) {
			System.out.println("Today is Thursday. I have SDLS class");
		} else if (day == 5) {
			System.out.println("Today is Friday. Wekeend is here");
		} else if (day == 6) {
			System.out.println("Today is Saturday. My favorite coding day");
		} else if (day == 7) {
			System.out.println("I love spending Sundays at Syntax");
		} else {
			System.out.println("I do not know this day");
		}

		int num1 = 100;
		int num2 = 200;

		if (num1 > num2) {
			System.out.println("Num1 is larger than num2");
		}

		else if (num1 == num2) {
			System.out.println("Num1 is equal num2");

		} else {
			System.out.println("Num2 is larger than num1");
		}

		System.out.println("I am done if statement");

	}

}
