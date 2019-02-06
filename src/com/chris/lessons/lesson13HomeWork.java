package com.chris.lessons;

public class lesson13HomeWork {

	public static void main(String[] args) {
		// print the sum of two dim array
		
		int[][]a = {{1,2,3,4,5},{2,3,4,5,6}};
		int sum = 0;
		
		//iterate over two dim array and add all the values
		for (int i = 0; i < a.length; i++) {
			for (int i1 = 0; i1 < a[i].length; i1++) {
				sum+=a[i][i1];
			}
		}
		
		System.out.println(sum);

	}

}
