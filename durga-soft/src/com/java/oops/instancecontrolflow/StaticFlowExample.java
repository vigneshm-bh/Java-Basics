package com.java.oops.instancecontrolflow;

public class StaticFlowExample {
	
	private static String m1(String s) {
		System.out.println(s);
		return s;
	}
	
	static String m = m1("1");
	
	{
		m = m1("2");
	}
	
	static {
		m = m1("3");
	}
	public static void main(String[] args) {
		Object o = new StaticFlowExample();
	}

}
