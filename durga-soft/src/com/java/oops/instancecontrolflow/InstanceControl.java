package com.java.oops.instancecontrolflow;

public class InstanceControl {
	int i = 0;
	
	{
		m1();
		System.out.println("First Instance Block");
	}
	
	public InstanceControl()
	{
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		// InstanceControl in = new InstanceControl(); try with this
		System.out.println("main method");
	}
	private void m1() {
		System.out.println(j);
	}
	
	{
		System.out.println("second instance block");
	}
	
	int j = 500;
}
