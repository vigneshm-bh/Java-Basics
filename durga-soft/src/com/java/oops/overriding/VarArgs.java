package com.java.oops.overriding;

public class VarArgs {

	public static void main(String[] args) {
		P2 p2 = new P2();
		p2.m1(10);
		C2 c2  = new C2();
		c2.m1(10);
		P2 p1 = new C2();
		p1.m1(10);
		
		System.out.println("\n-----------------------------\n");
		
		P3 p3 = new P3();
		System.out.println(p3.x);
		C3 c3 = new C3();
		System.out.println(c3.x);
		P3 p = new C3();
		System.out.println(p.x);
	}

}

//not overriding both has same name but different arguments
class P2{
	public void m1(int... x) {
		System.out.println("Parent");
	}
} 
class C2 extends P2{
	public void m1(int x) {  
		System.out.println("Child");
	}
}

class P3 {
	 int  x = 888;
}
class C3 extends P3{
	 int x = 777;
}
