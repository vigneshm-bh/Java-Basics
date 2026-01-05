package com.java.ExceptionHandling;

public class CustomizedExceptions {

	public static void main(String[] args) {
		int x = 30;
		
		if(x<18) {
			throw new TooYoungException("Too young to get married");
		}else if(x>60) {
			throw new TooOldException("Too old to get married");
		}else {
			System.out.println("You will get married soon");
		}
	}

}

class TooYoungException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public TooYoungException(String s) {
		super(s);
		
		// super(s) --> to make our descriptions available to the defaultExceptionHandler
	}
	
}

class TooOldException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public TooOldException(String s) {
		super(s);
	}
	
}