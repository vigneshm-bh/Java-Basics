package com.java.fundamentals;

public class VarArgMethods {

	public static void main(String[] args) {
		m1();
		m1(10,20);
		m1(1);
		m6(new int[] {10,20,30},new int[] {20,30});
		
		System.out.println("-------------------------------------");
		sum();
		sum(10,20,30);
		sum(1,2,3,4,5,6,7,8,9,10);
		
	}
	
	public static void m1(int... x) {
		System.out.println("Inside var-arg method "+ x.length);
	}
	public static void m1(int x) {
		System.out.println("General method....");
	}
	//public static void m1(int[] x) Duplicate method not valid
	
	public static void sum(int... x) {
		int sum = 0;
		for(int  i :x) {
			sum+=i;
		}
		System.out.println("The sum is: "+sum);
	}
	//case 1: -------------------------
	void m2(int ...x) {
		
	}
	void  m3(int...x) {
		
	}
	// void m4(int x...) invalid
	// void m5(int x...) invalid
	// void m6(int .x..) invalid
	// All the three dots should be together
	// case 1: -----------------------------
	
	
	void example(int x,int... y) {
		
	}
	//void example2(int... x,String s) invalid
	//void example3(int... x,double... y) invalid
	
	static void m6(int[]... x) {
		System.out.println("m6: "+x.length+" "+x[0].length);
		// valid
	}
}
