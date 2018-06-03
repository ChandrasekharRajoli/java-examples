package com.chandra.sorting;


public class BubbleSortExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsorted = { 5, 7, 1, 2, 7, 3, 8, 5 };
		printNumbers(unsorted);
		bubbleSort(unsorted);
		printNumbers(unsorted);
	}

	static void bubbleSort(int[] array) {
		int n = array.length;
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n - k - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
	}

	private static void printNumbers(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println("\n");
	}
}