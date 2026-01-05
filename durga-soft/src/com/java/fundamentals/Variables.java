package com.java.fundamentals;

public class Variables {
	
	int x = 10; //-----> instance - primitive
	double d;
	static int y = 20;  // -------> static - reference
	int[] arr;
	static int[] array;
	public static void main(String[] args) {
		//System.out.println(x); not a static variable
		//static double x = 20; invalid
		
		Variables variables = new Variables();  //-----> local - reference
		
		System.out.println(variables.x +" "+variables.y);
		
		variables.test();
		variables.another();
		variables.local();
		variables.loacalInitializ(args);
		variables.array();
	}
	
	public void test() {
		System.out.println("Inside test....................");

		int x = 15;
		System.out.println(this.x+x +" "+Variables.y);
	}
	
	public void another() {
		System.out.println("Inside another....................");
		
		Variables variables = new Variables();
		variables.d = 10.0;
		Variables.y = 50;
		Variables variables2 = new Variables();
		System.out.println(variables.d+" "+variables2.d+" "+variables2.y);
	}
	public void local() {
		System.out.println("Inside local....................");
		try {
			int i = Integer.parseInt("dd");
			System.out.println(i);
		}catch (NumberFormatException e) {
			//i = 0;
			System.out.println(e.getMessage());
		}
		
		int m;
		System.out.println("Hello");
		//System.out.println(m);
	}
	
	public void loacalInitializ(String[] temp ) {
		int x ;
		//public double y = 10; 
		if(temp.length>0) x = 10;
		else x = 20;
		System.out.println(x);
	}
	
	public void array() {
		Variables variables = new Variables();
		System.out.println(variables.arr);
		//System.out.println(arr.length);  NullPointerException
		variables.arr = new int[3];
		System.out.println(variables.arr[0]);
		
		System.out.println(array);
		array = new int[5];
		System.out.println(array[4]);
	}

}
