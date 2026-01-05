package com.java.MultiThreading;

public class JSynchronized { 
	public static void main(String[] args) {
		Display2 d1 = new Display2();
		MyThread11 m1 = new MyThread11(d1);
		MyThread12 m2 = new MyThread12(d1);
		m1.start();
		m2.start();
	}

}

class Display2 { // check with different combinations of sync method with the two methods
	
	public synchronized void displayInt() { 
	
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("error");
			}
			//System.out.println(name);
		}
	}
	public synchronized void displayChar() {
		for (char c = 'a'; c < 'j'; c++) {
			System.out.println(c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("error");
			}
			//System.out.println(name);
		}
	}
}


class MyThread11 extends Thread {
	Display2 d;
	public MyThread11(Display2 d) {
		this.d = d;
	}
	public void run() {
		d.displayInt();
	}
}



class MyThread12 extends Thread {
	Display2 d;
	public MyThread12(Display2 d) {
		this.d = d;
	}
	public void run() {
		d.displayChar();
	}
}
