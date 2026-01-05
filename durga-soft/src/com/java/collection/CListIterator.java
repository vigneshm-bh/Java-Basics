package com.java.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class CListIterator {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<>();
		l.add("Vicky");
		l.add("Kamal");
		l.add("Ram");
		l.add("Mani");
		
		System.out.println(l);
		
		ListIterator<String> ltr = l.listIterator();
		
		while(ltr.hasNext()) {
			String s = ltr.next();
			if(s.equals("Mani")) {
				ltr.remove();
			}else if(s.equals("Ram")) {
				ltr.add("Makesh");
			}else if(s.equals("Kamal")) {
				ltr.set("Dinesh");
			}
		}
		System.out.println(l);
		
		
	}

}
