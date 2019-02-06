package com.chris.lessons;

public class lesson16HomeWork {

	public static void main(String[] args) {
		
		shoe s = new shoe();
		
		s.brand = "nike";
		s.color = "blue";
		s.laces = false;
		s.price = 500;

		System.out.println(s.brand);
		System.out.println(s.color);
		System.out.println(s.laces);
		System.out.println(s.price);
	}

}

class shoe{
	
	String brand;
	String color;
	boolean laces;
	int price;
}
