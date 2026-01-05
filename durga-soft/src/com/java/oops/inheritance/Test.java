package com.java.oops.inheritance;

public class Test implements C{

	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		//p.m2();
		Child c  = new Child();
		c.m1();
		c.m2();
		
		
		Parent obj1 = new Child();
		//Child obj2 = new Parent();  -- invalid
		
		obj1.m1();
		//obj1.m2();  
	}

	@Override
	public void m1() {
		// Only one method will be created for all 3 declarations
		
	}

}
