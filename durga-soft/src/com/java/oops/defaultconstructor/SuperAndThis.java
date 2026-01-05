package com.java.oops.defaultconstructor;

public class SuperAndThis extends Parent123{
	int x = 200;
	public static void main(String[] args) {
		SuperAndThis superAndThis = new SuperAndThis();
		superAndThis.m1(100);
	}
	public void m1(int x) {
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}
class Parent123{
	int x = 500;
}
