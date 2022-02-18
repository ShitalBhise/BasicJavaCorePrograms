package com.swap;

import java.util.Scanner;

public class Swap {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int Num1 = scanner.nextInt();
		System.out.println("Enter Second Number : ");
		int Num2 = scanner.nextInt();

		int Swap = 0;
		Swap = Num1;
		Num1 = Num2;
		Num2 = Swap;

		System.out.println("After Swaping : ");
		System.out.println("Value of First Number : " + Num1);
		System.out.println("Value of Second Number : " + Num2);

	}
}
