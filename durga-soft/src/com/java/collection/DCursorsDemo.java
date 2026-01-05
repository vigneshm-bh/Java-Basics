package com.java.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class DCursorsDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		
		Enumeration<Integer> e = v.elements();
		
		Iterator<Integer> itr = v.iterator();
		
		ListIterator<Integer> ltr = v.listIterator();
		//Internal implementation of cursors
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(ltr.getClass().getName());
	}

}
