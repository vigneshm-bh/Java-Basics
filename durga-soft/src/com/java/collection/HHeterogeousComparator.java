package com.java.collection;

import java.util.Comparator;
import java.util.TreeSet;

//Write a program to insert String and StringBuffer objects into tree set where sorting order is
//increasing length order, if two objects having same length then consider their alphabetical order
public class HHeterogeousComparator implements Comparator<Object>{

	public static void main(String[] args) {
		TreeSet t = new TreeSet<>(new HHeterogeousComparator());
		
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		
		System.out.println(t);
		
	}

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		int i1 = s1.length();
		int i2 = s2.length();
		if(i1<i2) return -1;
		else if(i1>i2) return 1;
		else {
			return s1.compareTo(s2);
		}
	}

}
