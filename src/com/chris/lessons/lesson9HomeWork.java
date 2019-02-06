package com.chris.lessons;

import java.util.Scanner;

public class lesson9HomeWork {

	public static void main(String[] args) {
		// Basic calculator Add or Subtract 
		
		int tot;
		
   while(true) {
		
		Scanner r = new Scanner(System.in);
		
		System.out.println("Type \"add\" for addition or \"subtract\" for subtraction or multiplikation or division or break to quit");
		String operation = r.nextLine().toLowerCase();
		
		if(operation.equals("add")) {
			System.out.println("Enter first number: ");
			int a = r.nextInt();
			System.out.println("Enter second number: ");
			int b = r.nextInt();
		    tot = a + b;
			System.out.println("Your total after addition is: " + tot);			
		}else if(operation.equals("subtract")) {
			System.out.println("Enter first number: ");
			int a = r.nextInt();
			System.out.println("Enter second number: ");
			int b = r.nextInt();
			tot = a - b;
			System.out.println("Your total after subtraction is: " + tot);	
		}else if(operation.equals("multiplikation")) {
			System.out.println("Enter first number: ");
			int a = r.nextInt();
			System.out.println("Enter second number: ");
			int b = r.nextInt();
			tot = a * b;
			System.out.println("Your total after multiplikation is: " + tot);	
		}else if(operation.equals("division")) {
			System.out.println("Enter first number: ");
			int a = r.nextInt();
			System.out.println("Enter second number: ");
			int b = r.nextInt();
			tot = (a / b);
			System.out.println("Your total after division is: " + tot);	
		}else if(operation.equals("break")) {
			break;
		}
   }	
}

}
