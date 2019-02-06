package com.chris.lessons;

public class lesson12HomeWork {

	public static void main(String[] args) {
		// Create an arrya of random numbers and 
		//sort using bubble sort algorithm
		
		//int randomNumb = 0 + (int)(Math.random() * ((10 - 0) + 1));

		int[] a = new int[10];
		
		//populate array with random numbers
		for (int i = 0; i < a.length; i++) {
			//int randomNumb = 0 + (int)(Math.random() * ((10 - 0) + 1));
			int rand = (int)(Math.random() * 100);
			a[i] = rand;
			System.out.println(a[i]);
		}
		System.out.println("\n");
		
		//sort the array using bubblesort
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		
		//Print the sorted array
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
