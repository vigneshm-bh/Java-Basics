package com.java.collection;

import java.util.HashMap;
import java.util.WeakHashMap;

public class LWeakHashMap {

	public static void main(String[] args) {
		HashMap m = new HashMap<>();
		Temp t = new Temp();
		
		m.put(t, "bhcbhd");
		System.out.println(m);
		
		t = null;
		System.gc(); // Object t is not eligible for GC due to its associated with HashMap
		
		
		System.out.println("------------------");
		
		WeakHashMap m1 = new WeakHashMap();
		Temp t1 = new Temp();
		
		m1.put(t1, "hgfhd");
		System.out.println(m1);
		
		t1 = null;
		System.gc();  // Object t1 is eligible for GC due to its associated with HashMap
		
		System.out.println("------------------");
		System.out.println(m);
		System.out.println(m1);
		
	}

}

class Temp {
	
	public String toString() {
		return "To string method called";
	}
	
	public void finalize() {
		System.out.println("Finalize method called");
	}
}
