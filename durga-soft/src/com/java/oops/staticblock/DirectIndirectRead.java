package com.java.oops.staticblock;

public class DirectIndirectRead{
	static int x = 15;
	static {
		System.out.println(x);     //Direct read
		m1();
	}
	private static void m1() {
		System.out.println(x);     //Indirect read
	}
	public static void main(String[] args) {
		
	}
}