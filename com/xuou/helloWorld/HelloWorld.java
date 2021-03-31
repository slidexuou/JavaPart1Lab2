package com.xuou.helloWorld;

public class HelloWorld {
	public static void main(String [] args) {
		System.out.println("Hello World");
		
		int myNum =20;
		System.out.println("This is s Number " + myNum);
		
		boolean isSingle = false;
		System.out.println("This is a boolean " + isSingle);
		
		String myName = "Arinz";
		System.out.println("This is a String " + myName);
		bark();
	}
	public static void bark() {
		String dogName = "xuou";
		System.out.println("The Dog name ="+ dogName +"bark");
		
		int myInt = 5;
		float myFloat = myInt;
		System.out.println(myInt);
		System.out.println(myFloat);
		
		float newFloat = 7.7f;
		int newInt = (int)newFloat;
		System.out.println(newFloat);
		System.out.println(newInt);

		double lastDouble = 0.1d;
		float lastFloat = (float)lastDouble;
		System.out.println(lastDouble);
		System.out.println(lastFloat);
		
		char newChar = '\u0777';
		int flatInt = (int)newChar;
		System.out.println(newChar);
		System.out.println(flatInt);
	}
}

class FinalVar{
	public static void main(String[]args) {
		final String hello ="Hello";
		String hello = "World";
		System.out.println(hello);
}
}