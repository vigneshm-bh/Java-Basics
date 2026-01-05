package com.java.oops.instancecontrolflow;

public class InstanceFlowExample {
	
	private static String m1(String s) {
		System.out.println(s);
		return s;
	}
	public InstanceFlowExample() {
		String m = m1("1");
	}
	{
		String m = m1("2");
	}
	String m = m1("3");
	public static void main(String[] args) {
		Object obj = new InstanceFlowExample();
	}

}
