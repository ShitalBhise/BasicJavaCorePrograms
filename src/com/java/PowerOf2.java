package com.java;

import java.util.Scanner;

public class PowerOf2 {
	public static void powerOfTwo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int N = scanner.nextInt();
		if (N < 31) {
			for (int i = 0, powerOf2 = 1; i < N; i++) {
				System.out.println("2^" + i + " is " + powerOf2);
				powerOf2 *= 2;
			}
		} else {
			System.out.println(N + " is greater than or equal to 31: ");
		}
		scanner.close();
	}

	public static void main(String[] args) {
		powerOfTwo();

	}

}
