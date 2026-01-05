package com.java.fundamentals;

public class Array {

	public static void main(String[] args) {
		int[] a = new int[3];
		int[] ab = new int['a'];
		//int[] b = new int[Integer.MAX_VALUE]; OutOfMemoryError
		//int[] a = new int[-3];  Run time error NegativeArraySizeException
		System.out.println(ab.getClass().getName());
		
		System.out.println("---------------------------------------");
		
		System.out.println(a);
		System.out.println(a[0]);
		
		System.out.println("---------------------------------------");
		
		int[][] x = new int[2][3];
		System.out.println(x);
		System.out.println(x[0]);
		System.out.println(x[0][0]);
		
		System.out.println("---------------------------------------");
		
		int[][] y = new int[2][];
		System.out.println(y);
		//System.out.println(y[0]);   NullPointerException
		//System.out.println(y[0][0]);
		
		System.out.println("---------------------------------------");

		int[] z;
		// z = {1,2,3}; compile error
		System.out.println(y.length);
		
		Number[] n = new Number[10];
		n[0] = 1;
		n[1] = 2l;
		n[2] = 2f;
		n[3] = 2d;
		//n[4] = "SSDD";
		//n[4] = 'a';
		
		System.out.println("---------------------------------------");
		z = new int[4];
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		z = a;
		//char[] c = {'a','b','c'};
		//z = c; invalid
		z[0] = 10;
		for(int i:z) System.out.println(i);
	}

}
