package com.java;

import java.util.Scanner;

public class VowelConsonant {
	public static void Vowel() {
		char ch; // Declare variable
		System.out.println("Enter a Alphabet : ");
		Scanner scanner = new Scanner(System.in);
		ch = scanner.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Vowel");
		} else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println("Vowel");
		} else {
			System.out.println("Consonant");
		}
		scanner.close();
	}

	public static void main(String[] args) {
		Vowel();
	}

}
