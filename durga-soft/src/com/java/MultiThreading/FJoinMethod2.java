package com.java.MultiThreading;

public class FJoinMethod2 {

	public static void main(String[] args) throws InterruptedException {
		MyThead4.t = Thread.currentThread();
		MyThead4 myThead2 = new MyThead4();
		myThead2.start();
		//myThead2.join();  went to deadlock situation no output will be printed and both threads will wait forever
		
		//Thread.currentThread().join(); the same deadlock like above
		for(int i=0;i<10;i++) {
			Thread.sleep(1000);
			System.out.println("Main");
		}
	}

}

class MyThead4 extends Thread {
	static Thread t;
	public void run() {
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			System.out.println("Child");
		}
	}
}