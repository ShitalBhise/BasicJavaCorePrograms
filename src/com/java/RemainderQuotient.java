package com.java;

import java.util.Scanner;

public class RemainderQuotient {
	public static void quotientAndRemainderCheck() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to divide");
		int divedent = scanner.nextInt();
		System.out.println("Enter a number to divide with");
		int divider = scanner.nextInt();
		int quotient = divedent / divider;
		int remainder = divedent % divider;
		System.out.println("quotient= " + quotient + "\nremainder= " + remainder);
		scanner.close();
	}

	public static void main(String[] args) {
		quotientAndRemainderCheck();
	}

}
