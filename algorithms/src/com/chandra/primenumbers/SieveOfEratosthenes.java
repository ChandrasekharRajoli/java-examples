package com.chandra.primenumbers;

import java.util.Arrays;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		int n = 100000;
		System.out.print("Following are the prime numbers ");
		System.out.println("smaller than or equal to " + n);
		sieveOfEratosthenes(n);
		SieveOfSundaram(n);
	}

	public static void sieveOfEratosthenes(int n) {
		System.out.println("SieveOfEratosthenes->");
		boolean[] primeArray = new boolean[n + 1];
		Arrays.fill(primeArray, true);

		for (int i = 2; i * i <= n; i++) {
			if (primeArray[i]) {
				for (int j = i; i * j <= n; j++) {
					primeArray[i * j] = false;
				}
			}
		}

		for (int i = 0; i <= n; i++) {
			if (primeArray[i]) {
				System.out.print(i + ",");
			}
		}
	}

	public static void SieveOfSundaram(int n) {
		System.out.println("SieveOfSundaram->");
		int noNew = (n - 2) / 2;
		boolean[] nonPrimeArray = new boolean[noNew + 1];

		for (int i = 1; i <= noNew; i++) {
			for (int j = i; j <= (noNew - i) / (1 + 2 * i); j++) {
				nonPrimeArray[i + j + 2 * i * j] = true;
			}
		}

		for (int i = 1; i <= noNew; i++) {
			if (nonPrimeArray[i] == false) {
				System.out.print((2 * i + 1) + ",");
			}
		}

	}

}
