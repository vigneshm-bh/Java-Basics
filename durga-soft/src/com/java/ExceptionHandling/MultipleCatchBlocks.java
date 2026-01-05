package com.java.ExceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		try {
			int x = 10/0;
		}catch(Exception e) {
			System.out.println("Exception");
		}
//		catch(ArithmeticException e) {
//			System.out.println("ArithmeticException");
//		}  Invalid
		
		
		
		try {
			int x = 10/0;
		}catch (ArithmeticException e) {
			System.out.println("Arithametic");
		}catch (Exception e) {
			System.out.println("Second Exception");
		}
	}

}
