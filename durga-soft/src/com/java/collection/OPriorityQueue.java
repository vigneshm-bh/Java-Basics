package com.java.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class OPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue<>();
		System.out.println(q.peek());
		//System.out.println(q.element());
		
		for(int i=0;i<=10;i++) {
			q.offer(i);
		}
		
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
//Some operating systems wont provide proper support for PriorityQueue
		
		System.out.println("");
		
		customized();
	}

	public static void customized() {
		System.out.println("Customized sorting");
		
		PriorityQueue q = new PriorityQueue<>(15,new MyComparator1());
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");
		System.out.println(q);
		
	}
}

class MyComparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		return s2.compareTo(s1);
	}
	
}