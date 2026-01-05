package com.java.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class KIdentityHashMap {

	public static void main(String[] args) {
		HashMap m = new HashMap<>();         //HashMap will use .equals method to find duplicate keys
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		m.put(i1, "HJ");
		m.put(i2, "JH");
		
		System.out.println(m);
		
		IdentityHashMap im = new IdentityHashMap<>(); // Uses == operator 
		im.put(i1, "kkj");
		im.put(i2, "ksj");
		
		System.out.println(im);
		
	}

}
