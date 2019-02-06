package com.chris.lessons;

public class lesson7 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		a = 2;
		b = 2;
		c = 2;
		
		System.out.println(a + "," + b + "," +c);
		
		if (a > b && a > c) {
			
			System.out.println("a is the highest number");
		}else if (b > a && b > c) {
			
			System.out.println("b is the highest number");
		}else if(c > a && c > b) {
				 	
			System.out.println("c is the highest number");
		}else {
			System.out.println("At leat two of the values are equal!");
		}
	}

}
