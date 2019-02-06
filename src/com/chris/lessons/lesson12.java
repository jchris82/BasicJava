package com.chris.lessons;

public class lesson12 {

	public static void main(String[] args) {
		// Array sorting

		int[] a = new int[10];

		for (int i = 0; i < 10; i++) {
			a[i] = 10 - i;
		}

		//bubblesort algorithm 
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 9; j++)
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(a[i]);
		}

	}

}
