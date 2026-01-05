package com.java.MultiThreading;

public class ODaemonThread {

	public static void main(String[] args) {
		System.out.println("main "+Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true); Main thread is already started by JVM so we cant change main thread 
		
		MyThread18 m = new MyThread18();
		System.out.println("thread18 "+m.isDaemon());
		m.setDaemon(true);
		m.start();
		System.out.println("Thread18 after setting "+m.isDaemon());
	}

}
// Now child thread is daemon so when main thread terminates, child thread also will be terminated
class MyThread18 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}