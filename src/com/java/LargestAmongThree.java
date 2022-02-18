package com.java;

import java.util.Scanner;

public class LargestAmongThree {
	public static void largestAmongThree() {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num = 0;
		System.out.println("Enter Three Numbers : ");
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		if (num1 > num2 && num1 > num3) {
			num = num1;
		} else if (num2 > num1 && num2 > num3) {
			num = num2;
		} else {
			num = num3;
		}
		System.out.println(num + "is Greater than :- " + num1 + "," + num2 + "," + num3);
		scanner.close();
	}

	public static void main(String[] args) {
		largestAmongThree();
	}
}
