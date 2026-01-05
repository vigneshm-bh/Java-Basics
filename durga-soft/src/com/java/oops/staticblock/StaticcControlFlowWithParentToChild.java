package com.java.oops.staticblock;

public class StaticcControlFlowWithParentToChild {
	public static void main(String[] args) {
		
	}
}

class ParentClass{
	static int x = 10;
	static {
		m1();
		System.out.println("Base static block");
	}
	public static void main(String[] args) {
		m1();
		System.out.println("Base main");
	}
	private static void m1() {
		System.out.println(j);
	}
	static int j=15;
}

class DerivedClass extends ParentClass{
	static int x = 10;
	static {
		m2();
		System.out.println("Derived static block");
	}
	public static void main(String[] args) {
		m2();
		System.out.println("Derived main");
	}
	private static void m2() {
		System.out.println(j);
	}
	static {
		System.out.println("Derived second static block");
	}
	static int j=200;
}