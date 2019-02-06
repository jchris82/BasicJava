package com.chris.lessons;

public class lesson14 {

	public static void main(String[] args) {
		// print a string with random chars
		
		String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		
		String finalString ="";
		
		for (int i = 0; i < 10; i++) {
			finalString+=candidateChars.charAt((int)(Math.random() * candidateChars.length()));
		}
		System.out.println(finalString);
	}

}
