package com.chris.lessons;

public class lesson15HomeWork {

	
	static int[]sortArray(int unsortedArr[]) {
	    
		//Sort the array using bubblesort
		for (int i = 0; i < unsortedArr.length; i++) {
			for (int j = 0; j < unsortedArr.length - 1; j++) {
				if (unsortedArr[j] > unsortedArr[j + 1]){
					int temp = unsortedArr[j];
					unsortedArr[j] = unsortedArr[j + 1];
					unsortedArr[j + 1] = temp;
				}
			}
		}
		return unsortedArr;
	}
	
	// print the sorted Array
	public static void printArray(int printArr[]) {
		for (int i = 0; i < printArr.length; i++) {
			System.out.println("Sorted Array: " + printArr[i]);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		int unsortedArr[] = {4,5,3,2,1,9,6};
		printArray(sortArray(unsortedArr));

	}

}
