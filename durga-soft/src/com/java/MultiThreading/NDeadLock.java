package com.java.MultiThreading;

public class NDeadLock {

	public static void main(String[] args) {
		MyThread17 m = new MyThread17();
		m.m1();
		
		
	}
}

class MyThread17 extends Thread{
	D1 d1 = new D1();
	D2 d2 = new D2();
	
	public void m1() {
		this.start();
		d1.d1(d2);  //executed by main thread
	}
	
	public void run() {
		d2.d2(d1); //executed by mythread17 
	}
}

// If we remove any one synchronized there will be no deadlock
class D1 {
	synchronized void d1(D2 d) {
		System.out.println("Thread1 starts execution of d1 method");
		d.last();
	}
	synchronized void last() {
		System.out.println("Inside D1 last method");
	}
}

class D2{
	synchronized void d2(D1 d) {
		System.out.println("Thread2 starts execution of d2 method");
		d.last();
	}
	synchronized void last() {
		System.out.println("Inside D2 last method");
	}
}