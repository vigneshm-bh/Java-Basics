package com.java.oops.constructor;

public class Constructor {
	
	int x;
	String s;

	public Constructor(String string, int i) {
		this.s = string;
		this.x = i;
	}

	public Constructor() {
		
	}

	public void Constructor() { //will work as a method not as constructor
	}

	public static void main(String[] args) {
		Constructor c = new Constructor();
		System.out.println(c.s +" "+c.x);
		
		Constructor c1 = new Constructor("S",10);
		System.out.println(c1.s +" "+c1.x);
		c.Constructor();
	}

}
