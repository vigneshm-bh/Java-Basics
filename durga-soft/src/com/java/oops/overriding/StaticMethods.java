package com.java.oops.overriding;

public class StaticMethods {

	public static void main(String[] args) {
		P1 p = new C1();
		p.m1();
		P1 p1 = new P1();
		p1.m1();
		C1 c = new C1();
		c.m1();

	}

}

class P1{
	public static void m1() {
		System.out.println("Parent");
	}
	public void m2() {
		
	}
}

class C1 extends P1{
	//public void m1() {} invalid
	//public static void m2() {} invalid
	public static void m1() {
		System.out.println("Child");
	}
}
