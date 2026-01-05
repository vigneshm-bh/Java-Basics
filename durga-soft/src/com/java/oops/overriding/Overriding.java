package com.java.oops.overriding;

public class Overriding {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.marry();
		Child c = new Child();
		c.marry();
		Parent p = new Child();
		p.marry();
	}
	
	
}

class Parent{
	
	public void property(){
		System.out.println("Land-Gold-Cash");
	}
	public void marry() {
		System.out.println("Subbu");
	}
	
}

class Child extends Parent{
	public void marry() {
		System.out.println("Trisha/Samantha");
		return;
	}
}

abstract class P{
	public abstract void m1();
}
class C extends P{

	@Override
	public void m1() {
		
	}
	
}

abstract class X extends Parent{
	public abstract void marry();
}