package com.java.oops.overriding;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionRules {

	public static void main(String[] args) {

	}

}

class Parents{
	public void m1() throws Exception{
		//valid
	}
	public void m2() {
		
	}
	public void m3() throws Exception{
		
	}
	public void m4() throws IOException{
		
	}
	public void m5() throws IOException{
		
	}
	public void m6() throws IOException{
		
	}
	public void m7() throws IOException{
		
	}
	public void m8() throws ArithmeticException{ 
		
	}
}

class Childs extends Parent{
	public void m1() {
		
	}
	
	//public void m2() throws Exception{} invalid
	
	public void m3() throws IOException{
		
	}
	//public void m4() throws Exception{} invalid
	public void m5() throws FileNotFoundException,EOFException{
		
	}
	//public void m6() throws EOFException,InterruptedException{}
	public void m7() throws NullPointerException,ArithmeticException,ClassCastException{ //Unchecked Exceptions
		
	}
	//public void m8() throws Exception{}
	public void m8() {
		
	}
}