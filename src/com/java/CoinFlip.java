package com.java;

import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
	public static void flipCoin() {
		System.out.println("Enter the number to times coin flip");
		Scanner scanner = new Scanner(System.in); // to take input from user
		int CoinFlipNumber = scanner.nextInt(); // get coin flip number
		int numberOfTimes = 0; // initial number of coin flip is zero
		double headCount = 0;
		double tailCount = 0;
		int statusOfCoin = 0;

		Random random = new Random();
		if (CoinFlipNumber > 0) {
			while (numberOfTimes < CoinFlipNumber) {
				statusOfCoin = random.nextInt(2);
				if (statusOfCoin == 0) {
					++tailCount;
				} else {
					++headCount;
				}
				numberOfTimes++;
			}
		}
		double headCountPercentage = (double) ((headCount / CoinFlipNumber) * 100);
		System.out.println("headCountPercentage= " + headCountPercentage);
		double tailCountPercentage = (double) ((tailCount / CoinFlipNumber) * 100);
		System.out.println("tailCountPercentage= " + tailCountPercentage);
		scanner.close();
	}

	public static void main(String[] args) {
		flipCoin();
	}

}