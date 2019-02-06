package com.chris.lessons;

public class lesson11 {

	public static void main(String[] args) {
		// Arrays
		int [] a = new int[4];
		
		boolean[] t = new boolean[4];
		
		String[] str = new String[4];
		String[] str1 = {"12","56","Hello","Beef","Red"};
		
		// copy old array into new
		int[] b = {1,2,3,4,5};
		int[] b1 = new int[b.length + 1];
		
		for (int i = 0; i < b.length; i++) {
			b1[i] = b[i];
		}
		b = b1;
		
		b[5] = 5;
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		str[0] = "I";
		str[1] = "am";
		str[2] = "your";
		str[3] = "father";
		
		
		t[0] = true;
		t[1] = false;
		t[2] = true;
		t[3] = false;
		
		a[0] = 12;
		a[1] = 4;
		a[2] = 5;
		a[3] = 56;
		
		//iterate over array of numbers
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}
		
		//iterate over array of booleans
		for (int i = 0; i < t.length; i++) {
					
		   System.out.println(t[i]);
		}
		//iterate over array of booleans
		for (int i = 0; i < str.length; i++) {
					
		   System.out.println(str[i]);
				}		
	}

}
