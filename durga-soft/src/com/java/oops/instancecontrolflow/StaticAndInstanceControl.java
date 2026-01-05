package com.java.oops.instancecontrolflow;

public class StaticAndInstanceControl {
	{
		System.out.println("First instance block");
	}
	
	static {
		System.out.println("First static block");
	}
	
	public StaticAndInstanceControl() {
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		StaticAndInstanceControl control = new StaticAndInstanceControl();
		System.out.println("Main method");
		StaticAndInstanceControl instanceControl = new StaticAndInstanceControl();
	}
	static {
		System.out.println("Second static block");
	}
	
	{
		System.out.println("Second instance block");
	}
}

