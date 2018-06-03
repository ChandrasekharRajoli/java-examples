package com.chandra.sorting;

public class InsertionSort {

	public static void main(String a[]) {
		int[] array = { 10, 34, 2, 56, 7, 67, 88, 42 };
		insertionSort(array);
		for (int i : array) {
			System.out.print(i);
			System.out.print(", ");
		}
	}

	static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int value = array[i];
			int hole = i;
			while (hole > 0 && array[hole - 1] > value) {
				array[hole] = array[hole - 1];
				hole = hole - 1;
			}
			array[hole] = value;
		}
	}

	public static int[] doInsertionSort(int[] input) {
		int temp;
		for (int i = 1; i < input.length; i++) {
			for (int j = i; j > 0; j--) {
				if (input[j] < input[j - 1]) {
					temp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = temp;
				}
			}
		}
		return input;
	}
}