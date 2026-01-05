package com.java.oops.defaultconstructor;

public class ConstructorOverloading {

	public ConstructorOverloading() {
		this(10);
		System.out.println("No arg cons");
	}
	public ConstructorOverloading(int i) {
		this(10.5);
		System.out.println("int arg cons");
	}
	public ConstructorOverloading(double d) {
		System.out.println("double arg cons");
	}

	public static void main(String[] args) {
		ConstructorOverloading o = new ConstructorOverloading();
		ConstructorOverloading o1 = new ConstructorOverloading(10);
		ConstructorOverloading o2 = new ConstructorOverloading(10.5);
		ConstructorOverloading o3 = new ConstructorOverloading(15L);

	}

}
