package com.java.oops.defaultconstructor;

public class Recursion {

	public Recursion() {
		// this(10); recursive constructor calling compile error
	}
	
	public Recursion(int i) {
		this();
	}

	public static void main(String[] args) {
		Recursion r = new Recursion();
	}

}
