package com.java.MultiThreading;

public class KSynchronizedBlock {

	public static void main(String[] args) {
		Display3 d = new Display3();
		MyThread13 m1 = new MyThread13(d, "Dhoni");
		MyThread14 m2 = new MyThread14(d, "Virat");
		m1.start();
		m2.start();
	}

}

class Display3 {
	public void wish(String name) {
		// 1 lakh line of code
		synchronized (this) {

			for (int i = 0; i < 10; i++) {
				System.out.print("Good morning:");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(name);
			}

		}
		// 1 lakh code
	}
}

class MyThread13 extends Thread {
	Display3 d;
	String name;

	public MyThread13(Display3 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

class MyThread14 extends Thread {
	Display3 d;
	String name;

	public MyThread14(Display3 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}