package com.chris.lessons;

import java.util.Scanner;

public class lesson9 {

	public static void main(String[] args) {
		// Random numbers interval algorithm to get random numbers between 10 - 20 for example 
		/*
		int t = 10 + (int)(Math.random() * ((20 - 10) + 1));
		
		System.out.println(t);
		*/
		
		Scanner r = new Scanner(System.in);
		
		int a = (int)(Math.random() * 40 );
		
		System.out.println("Enter number");
		
		int b = r.nextInt();
		
		System.out.println(a + " + " + b + " is equal to " +(a +b));
		
	}

}
