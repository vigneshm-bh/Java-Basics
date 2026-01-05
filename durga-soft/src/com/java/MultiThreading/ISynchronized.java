package com.java.MultiThreading;

public class ISynchronized {  //Different object so irregular output
// If multiple threads are operating on same java object, then synchronization is required
// If multiple threads are operating on multiple java objects, then synchronization is not required
	public static void main(String[] args) {
		Display1 d1 = new Display1();
		Display1 d2 = new Display1();
		MyThread9 m1 = new MyThread9(d1, "Virat");
		MyThread10 m2 = new MyThread10(d2, "Dhoni");
		m1.start();
		m2.start();
	}

}

class Display1 {
	public synchronized void wish(String name) { 
		// check without synchronized keyword
		// with static keyword regular output, without it irregular output
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


class MyThread9 extends Thread {
	Display1 d;
	String name;

	public MyThread9(Display1 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

class MyThread10 extends Thread {
	Display1 d;
	String name;

	public MyThread10(Display1 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}