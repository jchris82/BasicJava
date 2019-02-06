package com.chris.lessons;

public class lesson15 {

	static void printArray(int toPrint[]) {
		for (int i = 0; i < toPrint.length; i++) {
			System.out.println(toPrint[i]);
		}
		//dead code after return
	}
	
	public static void main(String[] args) {
		//int output;
	   // output = add1(100);
	   //System.out.println(add1(100));
		int []y = {1,2,3,4,5};
		printArray(y);
	}

}
