package com.java.MultiThreading;

public class EJoinMethod {

	public static void main(String[] args) throws InterruptedException {
		MyThead3 myThead2 = new MyThead3();
		myThead2.start();
		myThead2.join();
		for(int i=0;i<10;i++) {
			System.out.println("Main");
		}
	}

}

class MyThead3 extends Thread {
		
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child");
		}
	}
}