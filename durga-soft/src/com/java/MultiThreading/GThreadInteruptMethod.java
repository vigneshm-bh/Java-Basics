package com.java.MultiThreading;

public class GThreadInteruptMethod {

	public static void main(String[] args) {
		MyThread5 myThread5 = new MyThread5();
		myThread5.start();
		myThread5.interrupt();
		System.out.println("Main end");
	}

}

class MyThread5 extends Thread{
	public void run() {
		try {
		for(int i=0;i<10;i++) {
			System.out.println("Lazy thread");
			
				Thread.sleep(2000);
			} 
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("got interupted");
		}
	}
}