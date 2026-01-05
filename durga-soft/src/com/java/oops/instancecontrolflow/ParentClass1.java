package com.java.oops.instancecontrolflow;



public class ParentClass1{
	int x = 0;
	
	{
		m1();
		System.out.println("Parent Instance Block");
	}
	
	public ParentClass1(){
		System.out.println("Parent Constructor");
	}
	public static void main(String[] args) {
		ParentClass1 parentClass1 = new ParentClass1();
		System.out.println("Parent Main");
	}
	private void m1() {
		System.out.println(j);
	}
	int j = 200;
}


class ChildClass1 extends ParentClass1{
	
	int x = 700;
	
	{
		m2();
		System.out.println("Child Instance Block");
	}
	
	public ChildClass1() {
		System.out.println("Child Constructor");
	}
	public static void main(String[] args) {
		ChildClass1 c = new ChildClass1();
		System.out.println("Child main");
	}

	private void m2() {
		
		System.out.println(z);
	}
	int z = 600;

}
