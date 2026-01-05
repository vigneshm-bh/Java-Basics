package com.java.MultiThreading;

public class LSynchronizedBlock { // Different object so irregular output
// If multiple threads are operating on same java object, then synchronization is required
// If multiple threads are operating on multiple java objects, then synchronization is not required
	public static void main(String[] args) {
		Display4 d1 = new Display4();
		Display4 d2 = new Display4();
		MyThread15 m1 = new MyThread15(d1, "Virat");
		MyThread16 m2 = new MyThread16(d2, "Dhoni");
		m1.start();
		m2.start();
	}

}

class Display4 {
	public synchronized void wish(String name) {
		// check without synchronized keyword
		// with static keyword regular output, without it irregular output
		synchronized (Display4.class) {
			synchronized (this) {
				
			}
			for (int i = 0; i < 10; i++) {
				System.out.print("Good morning:");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("error");
				}
				System.out.println(name);
			}
		}
	}
}

class MyThread15 extends Thread {
	Display4 d;
	String name;

	public MyThread15(Display4 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

class MyThread16 extends Thread {
	Display4 d;
	String name;

	public MyThread16(Display4 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}