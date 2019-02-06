package com.chris.lessons;

public class lesson6 {

	public static void main(String[] args) {
		// Strings Demo
		String a,b,c,d,e;
		
		a = "The";
		b = "Quick";
		c = "Brown";
		d = "Cat";
		e = "Jumped";
		
		
		//get the first char for all the strings
		String result = a.charAt(0)+"";
		result += b.charAt(0);
		result += c.charAt(0);
		result += d.charAt(0);
		result += e.charAt(0);
		
		//get the last char for all the strings
		result += a.charAt(a.length() -1);
		result += b.charAt(b.length() -1);
		result += c.charAt(c.length() -1);
		result += d.charAt(d.length() -1);
		result += e.charAt(e.length() -1);
		
		
		System.out.println(result);
		

	}

}
