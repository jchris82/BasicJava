package com.chris.lessons;

public class lesson11HomeWork {

	public static void main(String[] args) {
		// fill the array and print the sum
		
		int[]a = new int[100];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println("The sum is: " + sum);
	}

}
