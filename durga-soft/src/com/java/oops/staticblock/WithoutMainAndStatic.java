package com.java.oops.staticblock;

public class WithoutMainAndStatic {
	static int x =m1();

	private static int m1() {
		System.out.println("We can exceute without static block and main method");
		//System.exit(0);
		return 10;
	}
	static WithoutMainAndStatic s = new WithoutMainAndStatic();
	{
		System.out.println("We can exceute without static block and main method");
		//System.exit(0);
	}
	public WithoutMainAndStatic() {
		System.out.println("We can exceute without static block and main method");
		//System.exit(0);
	}
	
	public static void main(String[] args) {
		//From 1.7 v onwards main method is mandatory to start a program execution.
		//Hence from 1.7 v onwards without writing main method it is impossible to print
		// some statements to the console
	}
}
