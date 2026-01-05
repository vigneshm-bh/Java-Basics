package com.java.oops.overloading;

public class ParentChild {
	public static void main(String[] args) {
		ParentChild obj = new ParentChild();
		
		Animal a = new Animal();
		obj.m1(a);
		Monkey m = new Monkey();
		obj.m1(m);
		Animal ma = new Monkey();
		obj.m1(ma);
		
	}
	
	public void m1(Animal a) {
		System.out.println("Animal version");
	}
	public void m1(Monkey m) {
		System.out.println("Monkey version");
	}

}

class Animal{
	
}
class Monkey extends Animal{
	
}
