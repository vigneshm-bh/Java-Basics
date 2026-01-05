package com.java.MultiThreading;

class AMyThreadExtendsThread extends Thread{
	
	public void run() {
		
		for(int i=0;i<10;i++) {    //Executed by child thread
			System.out.println("Extending Thread Class"); 
		}
		System.out.print(Thread.currentThread().getPriority());
	}

}

public class AMyThreadExtendsThreadMain {
	
	public static void main(String[] args) { 
		System.out.println(Thread.currentThread().getPriority());
		AMyThreadExtendsThread thread = new AMyThreadExtendsThread(); //thread instantiation
		thread.start(); //starting a thread
		for(int i=0;i<10;i++) { //By main thread
			System.out.println("Main thread");
		}
		
	}

}
