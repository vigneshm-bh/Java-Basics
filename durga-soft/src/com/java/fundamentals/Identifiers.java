package com.java.fundamentals;

public class Identifiers {

	public static void main(String[] args) {
		int x = 10;
		// int if = 20; we cant use reserved words are identifiers
		int String = 888; 
		int Runnable = 999; // Not recommended, its reduces readability
		
		System.out.println(x +" "+String+" "+Runnable);
	}

	// A name in java program is known as identifiers
	// It can be method name, class name, variable name or label name
	// It is used for identification purpose

	/*
	 * There are 5 identifiers in this file --> 1. Identifiers (Class name) 
	 * 										--> 2. main (method name) 
	 * 										--> 3. String (In build class name)
	 * 										--> 4. args (label)
	 * 										--> 5. x (variable name)
	 */

	/*
	 * Rules for defining java identifiers:
	 * 		a-z, A-Z, 0-9, $, _ else compile time error will occur 
	 * 		Identifiers should not start with digits
	 * 		Java identifiers are case sensitive
	 */
	
}
