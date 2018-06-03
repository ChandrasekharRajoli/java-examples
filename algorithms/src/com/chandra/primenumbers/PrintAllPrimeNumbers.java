package com.chandra.primenumbers;

public class PrintAllPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPrimeNumbers(100000);
	}

	public static void printPrimeNumbers(int range) {
		int i = 0;
		int num = 0;
		String primeNumbers = "";
		long startTs = System.currentTimeMillis();
		for (i = 1; i <= range; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + ",";
			}
		}
		System.out.println("Prime numbers from 1 to "+range+" are :" + primeNumbers+ ", TotalTime :" +(System.currentTimeMillis()-startTs));
	}
	
}
