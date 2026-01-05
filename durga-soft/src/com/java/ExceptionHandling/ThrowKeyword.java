package com.java.ExceptionHandling;

public class ThrowKeyword {
	static ArithmeticException e ;
	public static void main(String[] args) {
		//case 1 
		//throw new ArithmeticException(); compile error
		try {
			int x = 10/0;
		}catch(Exception e) {
			//throw new ArithmeticException("/ by zero");
		}
		//case 1
		throw e; // gives NullPointerException
		//case 2
		//throw new ThrowKeyword(); invalid 
		
	}

}
