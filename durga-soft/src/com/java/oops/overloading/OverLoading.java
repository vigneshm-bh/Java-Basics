package com.java.oops.overloading;

public class OverLoading {

	public static void main(String[] args) {
		OverLoading promotion = new OverLoading();
		
		promotion.m1(10);
		promotion.m1(10.5f);
		promotion.m1(20L);
		//promotion.m1(10.5); double to float not possible
		
		System.out.println("\n--------------------------\n");
		
		promotion.m2(new Object());
		promotion.m2("HI");
		promotion.m2(null);
		
		System.out.println("\n--------------------------\n");
		
		promotion.m3("rw");
		promotion.m3(new StringBuffer());
		//promotion.m3(null); invalid
		
		System.out.println("\n--------------------------\n");
		
		promotion.m4(10, 10.5f);
		promotion.m4(10.5f, 10);
		//promotion.m4(10, 10); ambiguity
		//promotion.m4(10.4f, 10.4f); not matched
		
		System.out.println("\n--------------------------\n");
		
		promotion.m5();
		promotion.m5(1);
		promotion.m5(1,3);
	}
	
	//----------------------------------------------
	
	public void m1(int i) {
		System.out.println("int-arg");
	}
	public void m1(float f) {
		System.out.println("float-arg");
	}

	//----------------------------------------------
	
	public void m2(String s) {
		System.out.println("String version");
	}
	public void m2(Object o) {
		System.out.println("Object Version");
	}
	
	//----------------------------------------------
	
	public void m3(String s) {
		System.out.println("String version");
	}
	public void m3(StringBuffer sb) {
		System.out.println("StringBuffer version");
	}
	
	//----------------------------------------------
	
	public void m4(int i,float f) {
		System.out.println("int-float");
	}
	public void m4(float f,int i) {
		System.out.println("float-int");
	}
	
	//----------------------------------------------
	
	public void m5(int x) {
		System.out.println("General method");
	}
	public void m5(int... x) {
		System.out.println("var-arg method");
	}
}
