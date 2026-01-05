package com.java.MultiThreading;

public class DYieldMethod {

	public static void main(String[] args) {
		MyThead2 myThead2 = new MyThead2();
		myThead2.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main");
		}
	}

}

class MyThead2 extends Thread {
		
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child");
			Thread.yield();
		}
	}
}