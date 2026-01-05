package com.java.MultiThreading;

public class MInterThreadCommunication {

	public static void main(String[] args) throws InterruptedException {
		ThreadB t = new ThreadB();
		t.start();
		synchronized (t) {
			System.out.println("Main thread calling wait method");
			t.wait();
		}
		System.out.println(t.total);
	}

}

class ThreadB extends Thread {
	int total = 0;

	public void run() {
		System.out.println("ThreadB doing calculation");
		for (int i = 1; i <= 100; i++) {
			total += i;
		}
		synchronized (this) {
			System.out.println("ThreadB trying to give notification");
			this.notify();
		}
	}
}