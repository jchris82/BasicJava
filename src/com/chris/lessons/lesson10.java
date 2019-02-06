package com.chris.lessons;

public class lesson10 {

	public static void main(String[] args) {
		// Loops
		/*
		int a = 0;
		while(a < 10) {
			System.out.println(a);
			a++;
			
		}
			
		int a = 2;
		
		do {
		  //a++;	
		  System.out.println(a);
		  //a++;
		  
		}while(true);
		*/
		
		for(int i = 0; i < 10; i++) {
			
			if(i == 5) {
				continue;
			}else {
			 System.out.println(i);	
			}
			//break;
		}
		
		for(int i = 0; i < 10; i++) {
				
				System.out.println(i);
				continue;
				
			}
			//break;
	
	}
}
