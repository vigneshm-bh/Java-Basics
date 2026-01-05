package com.java.ExceptionHandling;

import java.io.IOException;

public class ThrowsKeyword {
	static long startTime = System.currentTimeMillis();
	public static void main(String[] args) throws Exception {
		cases();
		dostuff();
	}

	private static void cases() {
		try {
			System.out.println("Hello1");
		}catch(Exception e) {
			
		}
		
		try {
			System.out.println("Hello2");
		}catch(ArithmeticException e) {
			
		}
		
//		try {
//			System.out.println("Hello3");
//		}catch(IOException e) {
//			
//		}                                      //Code wont compile coz these are checked 
											//exceptions so compiler knows is there any
										//Possibility to rise that exception
//		
//		try {
//			System.out.println("Hello4");
//		}catch(InterruptedException e) {
//			
//		}
		
		try {
			System.out.println("Hello5");
		}catch(Error e) {
			
		}
	}

	private static void dostuff() throws Exception {
		doMoreStuff();
		throw new Exception(); //checked so c.E. will rise
		//IE also will come under Exception class so need to throw IE,Exception
	}

	private static void doMoreStuff() throws InterruptedException 
	{
		Thread.sleep(4000);
		System.out.println(System.currentTimeMillis() - startTime);
		throw new ArithmeticException(); //unchecked exception so no C.E.
	}

	
}
