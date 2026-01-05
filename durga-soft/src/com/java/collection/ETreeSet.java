package com.java.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ETreeSet {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet<>();
		
		t.add("A");
		t.add("a");
		t.add("ABZ");
		t.add("B");
		t.add("D");
		
		//t.add(new Integer(1));
		//t.add(null);
		//t.add("X");
		
		System.out.println(t);
		
		addingStringBuffer();

	}
	
	public static void addingStringBuffer() {
		TreeSet t = new TreeSet();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("F"));
		t.add(new StringBuffer("C"));
		t.add(new StringBuffer("D"));
		//Comparator<T>
		System.out.println(t);
	}
}
