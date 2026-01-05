package com.java.MultiThreading;

public class HSynchronized {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread6 myThread6 = new MyThread6(d, "Virat");
		MyThread7 myThread7 = new MyThread7(d, "Dhoni");
		myThread7.start();
		myThread6.start();
	}

}

class Display {
	public synchronized void wish(String name) { // check without synchronized keyword
		
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


class MyThread6 extends Thread {
	Display d;
	String name;

	public MyThread6(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

class MyThread7 extends Thread {
	Display d;
	String name;

	public MyThread7(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}