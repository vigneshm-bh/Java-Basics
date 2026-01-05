package com.java.oops.defaultconstructor;

public class SingletonClass {
	
	private static SingletonClass s = new SingletonClass();
 
	private SingletonClass() {
		
	}

	public static void main(String[] args) {
		SingletonClass s1 = SingletonClass.getSinletonClass();

	}

	private static SingletonClass getSinletonClass() {
		return s;
	}

}
