package com.java.MultiThreading;

import java.util.ArrayList;
import java.util.List;

public class BMyThreadExtendsRunnableMain {

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t1 = new Thread(r);      // Target Runnable
		t1.start(); 
		for(int i=0;i<10;i++) {
			System.out.println("Main method");
		}
		
		System.out.println("---------------------------------");
		System.out.println(Thread.currentThread().getName());
		t1.run();
		
	}
	
	public static void case1() {
		
	}

}

class MyRunnable implements Runnable{ //Defining the thread

	@Override
	public void run() {
		Thread.currentThread().setName("Random name");
		for(int i=0;i<10;i++) { //job of the thread
			System.out.println("Runnable method"); 
		}
		System.out.println(Thread.currentThread().getName());
	}
	
}