package com.java.ExceptionHandling;

public class ClassLevelThrowing //throws InterruptedException 
extends RuntimeException //makes it valid to throw this class
{

	ClassLevelThrowing() throws InterruptedException{
		
	}
	public static void main(String[] args) throws Exception
	{
		Thread.sleep(3000);
		throw new Error();
	}

}
