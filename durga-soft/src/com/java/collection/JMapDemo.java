package com.java.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JMapDemo {

	public static void main(String[] args) {
		HashMap m = new HashMap<>();
		m.put("Vignesh", 700);
		m.put("Ram", 600);
		m.put("Kamal", 500);
		m.put("Makesh", 400);
		
		System.out.println(m);
		System.out.println(m.put("Ram", 300));
		
		Set s = m.keySet();
		System.out.println(s);
		
		Collection c = m.values();
		System.out.println(c);
		
		Set s1 = m.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry e = (Entry) itr.next();
			
			System.out.println(e.getKey() + "----------"+e.getValue());
			e.setValue(200);
			System.out.println("!!!!!!!!!!!!!!!!!!");
			System.out.println(e.getKey() + "----------"+e.getValue());
		}
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		
	}

}
