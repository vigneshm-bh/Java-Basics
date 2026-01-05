package com.java.MultiThreading;

public class CTreadPriority {

	public static void main(String[] args) {
		System.out.println("min: " + Thread.MIN_PRIORITY);
		System.out.println("max: " + Thread.MAX_PRIORITY);
		System.out.println("normal: "+ Thread.NORM_PRIORITY);
		System.out.println("---------------------");
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(3);
		//Thread.currentThread().setPriority(13);
		System.out.println(Thread.currentThread().getPriority());
		
		
		
		myThread1 myThread1 = new myThread1();
		myThread1.setPriority(10);
		myThread1.start();
		System.out.println("main:"+Thread.currentThread().getPriority());
        System.out.println("child:"+myThread1.getPriority());
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
	}

}
// Some OS wont provide support for thread priority 
//So we are not getting the expected output
// expected output is first 10 "child thread" then 10 "main thread"

class myThread1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}
	}
}