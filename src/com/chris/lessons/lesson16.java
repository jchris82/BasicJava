package com.chris.lessons;

public class lesson16 {

	public static void main(String[] args) {
		// Object oriented concept
		
		desk d = new desk();
		
		d.numberOfLegs = 4;
		d.color = "light-Brown";
		d.material = "Oak";
		
		System.out.println(d.color);
		System.out.println(d.numberOfLegs);
		System.out.println(d.material);
	}

}

class desk{
	
	int numberOfLegs;
	String color;
	String material;
}
